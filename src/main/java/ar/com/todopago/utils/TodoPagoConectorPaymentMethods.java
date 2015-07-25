package ar.com.todopago.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.payment.Bank;
import ar.com.todopago.api.payment.Currency;
import ar.com.todopago.api.payment.DataServiceFault;
import ar.com.todopago.api.payment.Get;
import ar.com.todopago.api.payment.GetAll;
import ar.com.todopago.api.payment.GetComplete;
import ar.com.todopago.api.payment.GetPromotions;
import ar.com.todopago.api.payment.ObjectFactory;
import ar.com.todopago.api.payment.PaymentMethod;
import ar.com.todopago.api.payment.PaymentMethodBank;
import ar.com.todopago.api.payment.PaymentMethods;
import ar.com.todopago.api.payment.PaymentMethodsCollection;
import ar.com.todopago.api.payment.PaymentMethodsPortType;
import ar.com.todopago.api.payment.Promo;
import ar.com.todopago.api.payment.Promotion;
import ar.com.todopago.api.payment.PromotionsCollection;
import ar.com.todopago.api.payment.Result;


public class TodoPagoConectorPaymentMethods{

	private final static Logger logger = Logger.getLogger(TodoPagoConectorPaymentMethods.class.getName());

	private ObjectFactory factory;
	private String wsdl = null;
	private String endpoint = null;
	private PaymentMethodsPortType service = null;

	/**
	 * 
	 * @param wsdl
	 * @param endpoint
	 * @param auth 
	 * @param security
	 * @throws MalformedURLException
	 */
	public TodoPagoConectorPaymentMethods(String wsdl, String endpoint, Map<String, List<String>> auth) throws MalformedURLException {
		this.factory = new ObjectFactory();
		this.wsdl = wsdl;
		this.endpoint = endpoint;
		this.service = new PaymentMethods(new URL(this.wsdl)).getPaymentMethodsHttpsSoap11Endpoint();
		((BindingProvider) service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		((BindingProvider) service).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, auth);
	}


	/**
	 * 
	 * @param parameters
	 * @return
	 */
	//GetComplete
	public Map<String, Object> getCompleteValues(Map<String, String> parameters) {

		Map<String, Object> response = new HashMap<String, Object>();
		try{

			GetComplete operationId = this.parseToGetComplete(parameters);
			Result operationColection = service.getComplete(operationId);
			response = this.parseResultToArray(operationColection);

		}catch(DataServiceFault dsf){
			response.put(ElementNames.ErrorMessage, dsf.getMessage());
		}catch (Exception e) {
			response.put(ElementNames.ErrorMessage, e.getMessage());
		}

		return response;
	}

	//GetComplete
	private GetComplete parseToGetComplete(Map<String, String> parameters) {
		GetComplete o = factory.createGetComplete();
		if(parameters!=null){
			o.setAMOUNT(new Float(parameters.get(ElementNames.Ammount)));
			o.setMERCHANT(parameters.get(ElementNames.Merchant));
		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}

	//GetComplete & Get
	private Map<String, Object> parseResultToArray(Result res) {
		Map<String, Object> result = new HashMap<String, Object>();

		//BanksCollections
		Iterator<Bank> bankIt = res.getBanksCollection().getBank().iterator();
		Map <String, Object> list= new HashMap<String, Object>();
		while(bankIt.hasNext()){
			Map<String, Object> subMap = new HashMap<String, Object>();

			Bank current = bankIt.next();

			subMap.put(ElementNames.Id, current.getId());
			subMap.put(ElementNames.Logo, current.getLogo());
			subMap.put(ElementNames.Name, current.getName());

			bankIt.remove();

			list.put(current.getId(), subMap);

		}
		result.put(ElementNames.Bank, list);

		//PaymentMethodBankCollection
		Iterator<PaymentMethodBank> pmbIt = res.getPaymentMethodBanksCollection().getPaymentMethodBank().iterator();
		list.clear();
		while(pmbIt.hasNext()){
			Map<String, Object> subMap = new HashMap<String, Object>();

			PaymentMethodBank current = pmbIt.next();

			subMap.put(ElementNames.BankId, current.getBankId());
			subMap.put(ElementNames.PaymentMethodId, current.getPaymentMethodId());

			pmbIt.remove();

			list.put(current.getBankId(), subMap);
		}
		result.put(ElementNames.PaymentMethodBank, list);

		//PaymentMethodCollection
		list.clear();
		list = parsePaymentMethodsCollectionToArray(res.getPaymentMethodsCollection());
		result.put(ElementNames.PaymentMethod, list);


		//PromotionsCollection
		result.put(ElementNames.PromotionsCollection, 
				getPromotionMapFromPromotionsCollectionIterator(res.getPromotionsCollection().getPromotion().iterator()));

		logger.log(Level.INFO, "Armando sendAuthorizeRequestResponse: {0}", result);
		return result;
	}

	//GetPromotions
	public Map<String, Object> getPromotionsValues(Map<String, String> parameters) {

		Map<String, Object> response = new HashMap<String, Object>();
		try{

			GetPromotions getPromotions = this.parseToGePromotions(parameters);
			PromotionsCollection promotionsCollection = service.getPromotions(getPromotions);
			response = this.parsePromotionsCollectionToArray(promotionsCollection);

		}catch(DataServiceFault dsf){
			response.put(ElementNames.ErrorMessage, dsf.getMessage());
		}catch (Exception e) {
			response.put(ElementNames.ErrorMessage, e.getMessage());
		}

		return response;
	}

	//GetPromotions
	private GetPromotions parseToGePromotions(Map<String, String> parameters) {
		GetPromotions o = factory.createGetPromotions();
		if(parameters!=null){
			o.setAMOUNT(new Float(parameters.get(ElementNames.Ammount)));
			o.setMERCHANT(parameters.get(ElementNames.Merchant));
			o.setBANK(Integer.parseInt(parameters.get(ElementNames.Bank)));
			o.setPAYMENTMETHOD(Integer.parseInt(ElementNames.PaymentMethod));

		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}

	//GetPromotions
	private Map<String, Object> parsePromotionsCollectionToArray(PromotionsCollection res) {
		return getPromotionMapFromPromotionsCollectionIterator(res.getPromotion().iterator());
	}





	//GetAll
	public Map<String, Object> getAllValues(Map<String, String> parameters) {

		Map<String, Object> response = new HashMap<String, Object>();
		try{

			GetAll getAll = this.parseToGetAll(parameters);
			PaymentMethodsCollection paymentMethodsCollection = service.getAll(getAll);
			response = this.parsePaymentMethodsCollectionToArray(paymentMethodsCollection);

		}catch(DataServiceFault dsf){
			response.put(ElementNames.ErrorMessage, dsf.getMessage());
		}catch (Exception e) {
			response.put(ElementNames.ErrorMessage, e.getMessage());
		}

		return response;
	}

	//GetAll
	private GetAll parseToGetAll(Map<String, String> parameters) {
		GetAll o = factory.createGetAll();
		if(parameters!=null){
			o.setMERCHANT(parameters.get(ElementNames.Merchant));
		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}

	//GetAll
	private Map<String, Object> parsePaymentMethodsCollectionToArray(PaymentMethodsCollection res) {

		Map<String, Object> response = new HashMap<String, Object>();
		Iterator <PaymentMethod> pmIt = res.getPaymentMethod().iterator();

		while(pmIt.hasNext()){
			Map<String, Object> subMap = new HashMap<String, Object>();

			PaymentMethod current = pmIt.next();

			subMap.put(ElementNames.Id, current.getId());
			subMap.put(ElementNames.Logo, current.getLogo());
			subMap.put(ElementNames.Name, current.getName());
			subMap.put(ElementNames.ExpirationDateCheck, current.getExpirationDateCheck());
			subMap.put(ElementNames.CardNumberLengthMax, current.getCardNumberLengthMax().toString());
			subMap.put(ElementNames.CardNumberLengthMin, current.getCardNumberLengthMin().toString());
			subMap.put(ElementNames.SecurityCodeLength, current.getSecurityCodeLength().toString());

			//Currencies
			Iterator<Currency> ccIt = current.getCurrenciesCollection().getCurrency().iterator();
			Map<String, Object> subList = new HashMap<String, Object>();
			while(ccIt.hasNext()){
				Map<String, Object> innerMap = new HashMap<String, Object>();
				Currency currentInner = ccIt.next();
				innerMap.put(ElementNames.Id,currentInner.getId());
				innerMap.put(ElementNames.Name, currentInner.getName());

				ccIt.remove();

				subList.put(currentInner.getId(), innerMap);
			}
			subMap.put(ElementNames.Currency, subList);

			//Promo
			Iterator<Promo> prIt = current.getPromosCollection().getPromo().iterator();
			subList.clear();
			while(prIt.hasNext()){
				Map<String, Object> innerMap = new HashMap<String, Object>();
				Promo currentInner = prIt.next();
				innerMap.put(ElementNames.Id, currentInner.getId());
				innerMap.put(ElementNames.Description, currentInner.getDescription());
				innerMap.put(ElementNames.Discount, currentInner.getDiscount());
				innerMap.put(ElementNames.InstallmentsMax, currentInner.getInstallmentsMax());
				innerMap.put(ElementNames.InstallmentsMin, currentInner.getInstallmentsMin());
				innerMap.put(ElementNames.Name, currentInner.getName());

				Iterator<Bank> bIt = currentInner.getBanksCollection().getBank().iterator();
				Map<String, Object> secondSubList = new HashMap<String, Object>();
				while(bIt.hasNext()){
					Map<String, Object> secondInnerMap = new HashMap<String, Object>();
					Bank currentSubInner = bIt.next();

					secondInnerMap.put(ElementNames.Id, currentSubInner.getId());
					secondInnerMap.put(ElementNames.Name, currentSubInner.getName());
					secondInnerMap.put(ElementNames.Logo, currentSubInner.getLogo());

					bIt.remove();
					secondSubList.put(currentSubInner.getId(), secondInnerMap);
				}
				innerMap.put(ElementNames.Bank, secondSubList);

				prIt.remove();

				subList.put(current.getId(), innerMap);
			}
			subMap.put(ElementNames.Promo, subList);

			pmIt.remove();

			response.put(current.getId(), subMap);
		}

		return response;

	}



	//Get
	public Map<String, Object> getGetValues(Map<String, String> parameters) {

		Map<String, Object> response = new HashMap<String, Object>();
		try{

			Get operationId = this.parseToGet(parameters);
			Result operationColection = service.get(operationId);
			response = this.parseResultToArray(operationColection);

		}catch(DataServiceFault dsf){
			response.put(ElementNames.ErrorMessage, dsf.getMessage());
		}catch (Exception e) {
			response.put(ElementNames.ErrorMessage, e.getMessage());
		}

		return response;
	}

	//Get
	private Get parseToGet(Map<String, String> parameters) {
		Get o = factory.createGet();
		if(parameters!=null){
			o.setMERCHANT(parameters.get(ElementNames.Merchant));
		}
		logger.log(Level.INFO, "Armando SendAuthorizeRequest: {0}", o);
		return o;
	}


	private Map<String, Object> getPromotionMapFromPromotionsCollectionIterator(Iterator<Promotion> promosIt){
		Map <String, Object> list = new HashMap<String, Object>();

		while(promosIt.hasNext()){
			Map<String, Object> subMap = new HashMap<String, Object>();
			Promotion current = promosIt.next();

			subMap.put(ElementNames.Ammount, current.getAmount());
			subMap.put(ElementNames.BuyerCfBonus, current.getBuyerCfBonus());
			subMap.put(ElementNames.Coefficient, current.getCoefficient());
			subMap.put(ElementNames.DirectRate, current.getDirectRate());
			subMap.put(ElementNames.FeeQuantity, current.getFeeQuantity());
			subMap.put(ElementNames.Id, current.getId());
			subMap.put(ElementNames.Payment, current.getPayment());
			subMap.put(ElementNames.PromotionId, current.getPromotionId());
			subMap.put(ElementNames.RateId, current.getRateId());
			subMap.put(ElementNames.SellerCfBonus, current.getSellerCfBonus());
			subMap.put(ElementNames.Tna, current.getTna());

			promosIt.remove();

			list.put(current.getId().toString(), subMap);

		}
		return list;

	}
}
