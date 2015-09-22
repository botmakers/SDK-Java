package com.ar.todopago.ejemplo;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.TodoPagoConector;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SampleUI extends javax.swing.JFrame {

    
    TodoPagoConector tpc;
    
    private javax.swing.JButton AA;
    private javax.swing.JButton btSAR;
    private javax.swing.JButton jBConfigure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton status;
    private javax.swing.JTextField tfAmmount;
    private javax.swing.JTextField tfAnswerKeyAA;
    private javax.swing.JTextField tfAuthorization;
    private javax.swing.JTextField tfAuthorizeWSDL;
    private javax.swing.JTextField tfCurrencyCode;
    private javax.swing.JTextField tfEMAILCLIENTE;
    private javax.swing.JTextField tfEncoding;
    private javax.swing.JTextField tfMerchant;
    private javax.swing.JTextField tfMerchantAA;
    private javax.swing.JTextField tfMerchantS;
    private javax.swing.JTextField tfOperationId;
    private javax.swing.JTextField tfOperationIdS;
    private javax.swing.JTextField tfOperationsEndpoiint;
    private javax.swing.JTextField tfRequestKeyAA;
    private javax.swing.JTextField tfSecurity;
    private javax.swing.JTextField tfSecurityAA;
    private javax.swing.JTextField tfSession;
    private javax.swing.JTextField tfURLError;
    private javax.swing.JTextField tfURLOk;
    private javax.swing.JTextArea tpAnswerAA;
    private javax.swing.JTextArea tpAnswerStatus;
    private javax.swing.JTextArea tpResponse;
    private JTextField CSBTCITY;
    private JTextField CSBTEMAIL;
    private JTextField CSBTFIRSTNAME;
    private JTextField CSBTPOSTALCODE;
    private JTextField CSBTSTREET1;
    private JLabel lblCsbtipaddress;
    private JLabel lblCsptgrandtotalamount;
    private JLabel lblCsmdd;
    private JLabel lblCsmdd_2;
    private JLabel lblCsmdd_4;
    private JTextField CSMDD11;
    private JTextField CSMDD9;
    private JTextField CSMDD7;
    private JTextField CSPTGRANDTOTALAMOUNT;
    private JTextField CSBTIPADDRESS;
    private JLabel lblCsbtcountry;
    private JLabel lblCsbtphonenumber;
    private JLabel lblCsbtlastname;
    private JLabel lblCsbtstate;
    private JLabel lblCsbtcustomerid;
    private JLabel lblCsptcurrency;
    private JLabel lblCSMDD6;
    private JLabel lblCsmdd_1;
    private JLabel lblCsmdd_3;
    private JLabel lblCsbtstreet_1;
    private JTextField CSBTSTREET2;
    private JTextField CSMDD10;
    private JTextField CSMDD8;
    private JTextField CSMDD6;
    private JTextField CSPTCURRENCY;
    private JTextField CSBTCUSTOMERID;
    private JTextField CSBTSTATE;
    private JTextField CSBTLASTNAME;
    private JTextField CSBTPHONENUMBER;
    private JTextField CSBTCOUNTRY;
    private JPanel panel_1;
    private JLabel lblCsitproductname;
    private JTextField CSITPRODUCTNAME;
    private JLabel lblCsitproductcode;
    private JTextField CSITPRODUCTCODE;
    private JLabel lblCsmdd_7;
    private JTextField CSMDD14;
    private JLabel lblCsmdd_5;
    private JTextField CSMDD12;
    private JLabel lblCsststreet;
    private JTextField CSSTSTREET1;
    private JLabel lblCsstpostalcode;
    private JTextField CSSTPOSTALCODE;
    private JLabel lblCsstfirstname;
    private JTextField CSSTFIRSTNAME;
    private JLabel lblCsstemail;
    private JTextField CSSTEMAIL;
    private JLabel lblCsstcity;
    private JTextField CSSTCITY;
    private JLabel lblCsitproductsku_1;
    private JTextField CSITTOTALAMOUNT;
    private JLabel lblCsstcountry;
    private JTextField CSSTCOUNTRY;
    private JLabel lblCsstphonenumber;
    private JLabel lblCsstlastname;
    private JLabel lblCsststate;
    private JTextField CSSTSTATE;
    private JTextField CSSTLASTNAME;
    private JTextField CSSTPHONENUMBER;
    private JLabel lblCsmdd_6;
    private JLabel lblCsmdd_8;
    private JLabel lblCsitproductdescription;
    private JLabel lblCsitproductsku;
    private JLabel lblCsitquantity;
    private JTextField CSITQUANTITY;
    private JTextField CSITPRODUCTSKU;
    private JTextField CSITPRODUCTDESCRIPTION;
    private JTextField CSMDD15;
    private JTextField CSMDD13;
    private JLabel lblCsststreet_1;
    private JTextField CSSTSTREET2;
    private JLabel lblCsitunitprice;
    private JTextField CSITUNITPRICE;
    private JLabel lblCsmdd_9;
    private JTextField CSMDD16;
    
    private JComboBox vertical;
    
    
    public SampleUI() {
    	setFont(new Font("Tahoma", Font.PLAIN, 11));
    	setTitle("TodoPago Ejemplo");
    	setPreferredSize(new Dimension(800, 600));
        initComponents();
    }

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfAuthorizeWSDL = new javax.swing.JTextField();
        tfOperationsEndpoiint = new javax.swing.JTextField();
        tfAuthorization = new javax.swing.JTextField();
        jBConfigure = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfSession = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSecurity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEncoding = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfMerchant = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfOperationId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfCurrencyCode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfAmmount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfURLOk = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfURLError = new javax.swing.JTextField();
        btSAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tpResponse = new javax.swing.JTextArea();
        tpResponse.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel18 = new javax.swing.JLabel();
        tfEMAILCLIENTE = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfSecurityAA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfMerchantAA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfRequestKeyAA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAnswerKeyAA = new javax.swing.JTextField();
        AA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tfMerchantS = new javax.swing.JTextField();
        status = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfOperationIdS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tpAnswerStatus = new javax.swing.JTextArea();
        tpAnswerStatus.setFont(new Font("Tahoma", Font.PLAIN, 11));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel22.setText("Authorization");

        jLabel26.setText("Endpoint");

        jLabel9.setText("AuthorizeWSDL");

        tfAuthorizeWSDL.setText("file:D:/WorkspaceJuno/TodoPago-sdk/res/Authorize.wsdl");

        tfOperationsEndpoiint.setText("https://developers.todopago.com.ar/");

        tfAuthorization.setText("PRISMA f3d8b72c94ab4a06be2ef7c95490f7d3");

        jBConfigure.setText("Configure");
        jBConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel4Layout.createSequentialGroup()
        							.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfOperationsEndpoiint, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel4Layout.createSequentialGroup()
        							.addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfAuthorization, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel4Layout.createSequentialGroup()
        							.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfAuthorizeWSDL, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addGap(175)
        					.addComponent(jBConfigure, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(tfAuthorizeWSDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(78)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel26)
        				.addComponent(tfOperationsEndpoiint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel22)
        				.addComponent(tfAuthorization, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(76)
        			.addComponent(jBConfigure)
        			.addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        jTabbedPane1.addTab("Config", jPanel4);

        jLabel1.setText("Session");

        tfSession.setText("ABCDEF-1234-12221-FDE1-00000200");

        jLabel2.setText("Security");

        tfSecurity.setText("1234567890ABCDEF1234567890ABCDEF");

        jLabel11.setText("EncodingMethod");

        tfEncoding.setText("XML");

        jLabel12.setText("Merchant");

        tfMerchant.setText("2153");

        jLabel13.setText("OperationId");

        tfOperationId.setText("01");

        jLabel14.setText("CurrencyCode");

        tfCurrencyCode.setText("032");

        jLabel15.setText("Amount");

        tfAmmount.setText("54");

        jLabel16.setText("URL_OK");

        tfURLOk.setText("http,//www.google.com");

        jLabel17.setText("URL_Error");

        tfURLError.setText("http,//www.yahoo.com");

        btSAR.setText("sendAuthorizeRequest");
        btSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSARActionPerformed(evt);
            }
        });

        jLabel4.setText("Answer:");

        tpResponse.setColumns(20);
        tpResponse.setRows(5);
        jScrollPane8.setViewportView(tpResponse);

        jLabel18.setText("EMAILCLIENTE");

        tfEMAILCLIENTE.setText("email_cliente@dominio.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfOperationId, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfCurrencyCode, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfAmmount, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfURLOk, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfURLError, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfSecurity, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfEncoding, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfMerchant, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfSession, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(tfEMAILCLIENTE, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btSAR))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jScrollPane8, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(tfSession, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(tfSecurity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(tfEncoding, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(tfMerchant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel13)
        				.addComponent(tfOperationId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel14)
        				.addComponent(tfCurrencyCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(tfAmmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel16)
        				.addComponent(tfURLOk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel17)
        				.addComponent(tfURLError, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel18)
        				.addComponent(tfEMAILCLIENTE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btSAR)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane8, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("sendAuthorizeRequest", jPanel2);

        jLabel5.setText("Security");

        tfSecurityAA.setText("1234567890ABCDEF1234567890ABCDEF");

        jLabel6.setText("Merchant");

        tfMerchantAA.setText("2153");
        
        jLabel7.setText("RequestKey");

        tfRequestKeyAA.setText("8496472a-8c87-e35b-dcf2-94d5e31eb12f");

        jLabel8.setText("AnswerKey");

        tfAnswerKeyAA.setText("8496472a-8c87-e35b-dcf2-94d5e31eb12f");

        AA.setText("getAuthorizeAnswer");
        AA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAActionPerformed(evt);
            }
        });

        jLabel10.setText("Answer");
        jScrollPane5 = new javax.swing.JScrollPane();
        tpAnswerAA = new javax.swing.JTextArea();
        tpAnswerAA.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
                tpAnswerAA.setColumns(20);
                tpAnswerAA.setRows(5);
                jScrollPane5.setViewportView(tpAnswerAA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane5, Alignment.LEADING)
        				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(tfAnswerKeyAA, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        						.addComponent(tfRequestKeyAA)
        						.addComponent(tfMerchantAA)
        						.addComponent(tfSecurityAA)))
        				.addComponent(AA, Alignment.LEADING)
        				.addComponent(jScrollPane6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10, Alignment.LEADING))
        			.addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(tfSecurityAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(tfMerchantAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(tfRequestKeyAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(tfAnswerKeyAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(AA)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jTabbedPane1.addTab("getAuthorizeAnswer", jPanel1);

        jLabel21.setText("Merchant");

        tfMerchantS.setText("2153");

        status.setText("getStatus");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel23.setText("Answer");

        jLabel24.setText("OperationID");

        tfOperationIdS.setText("01");

        tpAnswerStatus.setColumns(20);
        tpAnswerStatus.setRows(5);
        jScrollPane11.setViewportView(tpAnswerStatus);

        jScrollPane1.setViewportView(jScrollPane11);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, Alignment.LEADING)
        				.addComponent(status, Alignment.LEADING)
        				.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfMerchantS, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfOperationIdS, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel23, Alignment.LEADING))
        			.addContainerGap(635, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel21)
        				.addComponent(tfMerchantS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(4)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel24)
        				.addComponent(tfOperationIdS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(status)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel23)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel5.setLayout(jPanel5Layout);

        jTabbedPane1.addTab("getStatus", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        
        JPanel panel = new JPanel();
        jTabbedPane1.addTab("CyberSource", null, panel, null);
        
        JLabel lblCsbtcity = new JLabel();
        lblCsbtcity.setText("CSBTCITY");
        
        CSBTCITY = new JTextField();
        CSBTCITY.setText("Villa General Belgrano");
        
        JLabel lblCsbtemail = new JLabel();
        lblCsbtemail.setText("CSBTEMAIL");
        
        CSBTEMAIL = new JTextField();
        CSBTEMAIL.setText("todopago@hotmail.com");
        
        JLabel lblCsbtfirstname = new JLabel();
        lblCsbtfirstname.setText("CSBTFIRSTNAME");
        
        CSBTFIRSTNAME = new JTextField();
        CSBTFIRSTNAME.setText("Cosme");
        
        JLabel lblCsbtpostalcode = new JLabel();
        lblCsbtpostalcode.setText("CSBTPOSTALCODE");
        
        CSBTPOSTALCODE = new JTextField();
        CSBTPOSTALCODE.setText("1010");
        
        JLabel lblCsbtstreet = new JLabel();
        lblCsbtstreet.setText("CSBTSTREET1");
        
        CSBTSTREET1 = new JTextField();
        CSBTSTREET1.setText("Cerrito 740");
        
        lblCsbtipaddress = new JLabel();
        lblCsbtipaddress.setText("CSBTIPADDRESS");
        
        lblCsptgrandtotalamount = new JLabel();
        lblCsptgrandtotalamount.setText("CSPTGRANDTOTALAMOUNT");
        
        lblCsmdd = new JLabel();
        lblCsmdd.setText("CSMDD7");
        
        lblCsmdd_2 = new JLabel();
        lblCsmdd_2.setText("CSMDD9");
        
        lblCsmdd_4 = new JLabel();
        lblCsmdd_4.setText("CSMDD11");
        
        CSMDD11 = new JTextField();
        CSMDD11.setText("");
        
        CSMDD9 = new JTextField();
        CSMDD9.setText("");
        
        CSMDD7 = new JTextField();
        CSMDD7.setText("");
        
        CSPTGRANDTOTALAMOUNT = new JTextField();
        CSPTGRANDTOTALAMOUNT.setText("125.38");
        
        CSBTIPADDRESS = new JTextField();
        CSBTIPADDRESS.setText("192.0.0.4");
        
        lblCsbtcountry = new JLabel();
        lblCsbtcountry.setText("CSBTCOUNTRY");
        
        lblCsbtphonenumber = new JLabel();
        lblCsbtphonenumber.setText("CSBTPHONENUMBER");
        
        lblCsbtlastname = new JLabel();
        lblCsbtlastname.setText("CSBTLASTNAME");
        
        lblCsbtstate = new JLabel();
        lblCsbtstate.setText("CSBTSTATE");
        
        lblCsbtcustomerid = new JLabel();
        lblCsbtcustomerid.setText("CSBTCUSTOMERID");
        
        lblCsptcurrency = new JLabel();
        lblCsptcurrency.setText("CSPTCURRENCY");
        
        lblCSMDD6 = new JLabel();
        lblCSMDD6.setText("CSMDD6");
        
        lblCsmdd_1 = new JLabel();
        lblCsmdd_1.setText("CSMDD8");
        
        lblCsmdd_3 = new JLabel();
        lblCsmdd_3.setText("CSMDD10");
        
        lblCsbtstreet_1 = new JLabel();
        lblCsbtstreet_1.setText("CSBTSTREET2");
        
        CSBTSTREET2 = new JTextField();
        CSBTSTREET2.setText("");
        
        CSMDD10 = new JTextField();
        CSMDD10.setText("");
        
        CSMDD8 = new JTextField();
        CSMDD8.setText("Y");
        
        CSMDD6 = new JTextField();
        CSMDD6.setText("");
        
        CSPTCURRENCY = new JTextField();
        CSPTCURRENCY.setText("ARS");
        
        CSBTCUSTOMERID = new JTextField();
        CSBTCUSTOMERID.setText("453458");
        
        CSBTSTATE = new JTextField();
        CSBTSTATE.setText("B");
        
        CSBTLASTNAME = new JTextField();
        CSBTLASTNAME.setText("Fulanito");
        
        CSBTPHONENUMBER = new JTextField();
        CSBTPHONENUMBER.setText("541160913988");
        
        CSBTCOUNTRY = new JTextField();
        CSBTCOUNTRY.setText("AR");
        
        vertical = new JComboBox();
        vertical.setModel(new DefaultComboBoxModel(new String[] {"Retail"}));
        vertical.setSelectedIndex(0);
        
        
        
        JLabel lblVertical = new JLabel("Vertical:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsmdd_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSMDD9))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsmdd, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSMDD7))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsptgrandtotalamount, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSPTGRANDTOTALAMOUNT))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtipaddress, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTIPADDRESS))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtstreet, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTSTREET1))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtpostalcode, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTPOSTALCODE))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtfirstname, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTFIRSTNAME))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtemail, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTEMAIL))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtcity, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTCITY, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblCsmdd_4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblVertical))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addComponent(vertical, 0, 191, Short.MAX_VALUE)
        						.addComponent(CSMDD11))))
        			.addGap(50)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblCsbtcountry, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(CSBTCOUNTRY, 191, 191, 191))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblCsbtphonenumber, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsbtlastname, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsbtstate, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addComponent(CSBTSTATE, 191, 191, 191)
        						.addComponent(CSBTLASTNAME, 191, 191, 191)
        						.addComponent(CSBTPHONENUMBER, 191, 191, 191)))
        				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        					.addGroup(gl_panel.createSequentialGroup()
        						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        							.addComponent(lblCsbtcustomerid, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblCsptcurrency, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblCSMDD6, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblCsmdd_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblCsmdd_3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        							.addComponent(CSMDD10, 191, 191, 191)
        							.addComponent(CSMDD8, 191, 191, 191)
        							.addComponent(CSMDD6, 191, 191, 191)
        							.addComponent(CSPTCURRENCY, 191, 191, 191)
        							.addComponent(CSBTCUSTOMERID, 191, 191, 191)))
        					.addGroup(gl_panel.createSequentialGroup()
        						.addComponent(lblCsbtstreet_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(CSBTSTREET2, 191, 191, 191))))
        			.addContainerGap(83, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtcity)
        						.addComponent(CSBTCITY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(4)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtemail)
        						.addComponent(CSBTEMAIL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsbtfirstname))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSBTFIRSTNAME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsbtpostalcode))
        						.addComponent(CSBTPOSTALCODE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsbtstreet))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSBTSTREET1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsbtipaddress))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSBTIPADDRESS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsptgrandtotalamount))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSPTGRANDTOTALAMOUNT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsmdd))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSMDD7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsmdd_2))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSMDD9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsmdd_4))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSMDD11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(3)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtcountry)
        						.addComponent(CSBTCOUNTRY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(3)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtphonenumber)
        						.addComponent(CSBTPHONENUMBER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtlastname)
        						.addComponent(CSBTLASTNAME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtstate)
        						.addComponent(CSBTSTATE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsbtstreet_1)
        						.addComponent(CSBTSTREET2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSBTCUSTOMERID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsbtcustomerid))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSPTCURRENCY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsptcurrency))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSMDD6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCSMDD6))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSMDD8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsmdd_1))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSMDD10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsmdd_3))))
        			.addGap(18)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(vertical, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblVertical))
        			.addContainerGap(241, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        
        panel_1 = new JPanel();
        jTabbedPane1.addTab("CS Retail", null, panel_1, null);
        
        lblCsitproductname = new JLabel();
        lblCsitproductname.setText("CSITPRODUCTNAME");
        
        CSITPRODUCTNAME = new JTextField();
        CSITPRODUCTNAME.setText("NOTEBOOK DF TOSHIBA#chocho");
        
        lblCsitproductcode = new JLabel();
        lblCsitproductcode.setText("CSITPRODUCTCODE");
        
        CSITPRODUCTCODE = new JTextField();
        CSITPRODUCTCODE.setText("electronic_good#chocho");
        
        lblCsmdd_7 = new JLabel();
        lblCsmdd_7.setText("CSMDD14");
        
        CSMDD14 = new JTextField();
        CSMDD14.setText("");
        
        lblCsmdd_5 = new JLabel();
        lblCsmdd_5.setText("CSMDD12");
        
        CSMDD12 = new JTextField();
        CSMDD12.setText("");
        
        lblCsststreet = new JLabel();
        lblCsststreet.setText("CSSTSTREET1");
        
        CSSTSTREET1 = new JTextField();
        CSSTSTREET1.setText("Cerrito 740");
        
        lblCsstpostalcode = new JLabel();
        lblCsstpostalcode.setText("CSSTPOSTALCODE");
        
        CSSTPOSTALCODE = new JTextField();
        CSSTPOSTALCODE.setText("1010");
        
        lblCsstfirstname = new JLabel();
        lblCsstfirstname.setText("CSSTFIRSTNAME");
        
        CSSTFIRSTNAME = new JTextField();
        CSSTFIRSTNAME.setText("Cosme");
        
        lblCsstemail = new JLabel();
        lblCsstemail.setText("CSSTEMAIL");
        
        CSSTEMAIL = new JTextField();
        CSSTEMAIL.setText("todopago@hotmail.com");
        
        lblCsstcity = new JLabel();
        lblCsstcity.setText("CSSTCITY");
        
        CSSTCITY = new JTextField();
        CSSTCITY.setText("Villa General Belgrano");
        
        lblCsitproductsku_1 = new JLabel();
        lblCsitproductsku_1.setText("CSITTOTALAMOUNT");
        
        CSITTOTALAMOUNT = new JTextField();
        CSITTOTALAMOUNT.setText("1254.40#10.00");
        
        lblCsstcountry = new JLabel();
        lblCsstcountry.setText("CSSTCOUNTRY");
        
        CSSTCOUNTRY = new JTextField();
        CSSTCOUNTRY.setText("AR");
        
        lblCsstphonenumber = new JLabel();
        lblCsstphonenumber.setText("CSSTPHONENUMBER");
        
        lblCsstlastname = new JLabel();
        lblCsstlastname.setText("CSSTLASTNAME");
        
        lblCsststate = new JLabel();
        lblCsststate.setText("CSSTSTATE");
        
        CSSTSTATE = new JTextField();
        CSSTSTATE.setText("B");
        
        CSSTLASTNAME = new JTextField();
        CSSTLASTNAME.setText("Fulanito");
        
        CSSTPHONENUMBER = new JTextField();
        CSSTPHONENUMBER.setText("541160913988");
        
        lblCsmdd_6 = new JLabel();
        lblCsmdd_6.setText("CSMDD13");
        
        lblCsmdd_8 = new JLabel();
        lblCsmdd_8.setText("CSMDD15");
        
        lblCsitproductdescription = new JLabel();
        lblCsitproductdescription.setText("CSITPRODUCTDESCRIPTION");
        
        lblCsitproductsku = new JLabel();
        lblCsitproductsku.setText("CSITPRODUCTSKU");
        
        lblCsitquantity = new JLabel();
        lblCsitquantity.setText("CSITQUANTITY");
        
        CSITQUANTITY = new JTextField();
        CSITQUANTITY.setText("1#1");
        
        CSITPRODUCTSKU = new JTextField();
        CSITPRODUCTSKU.setText("LEVJNSL36GN#chocho");
        
        CSITPRODUCTDESCRIPTION = new JTextField();
        CSITPRODUCTDESCRIPTION.setText("NOTEBOOK L845 SP4304LA DF TOSHIBA#chocho");
        
        CSMDD15 = new JTextField();
        
        CSMDD13 = new JTextField();
        CSMDD13.setText("");
        
        lblCsststreet_1 = new JLabel();
        lblCsststreet_1.setText("CSSTSTREET2");
        
        CSSTSTREET2 = new JTextField();
        CSSTSTREET2.setText("");
        
        lblCsitunitprice = new JLabel();
        lblCsitunitprice.setText("CSITUNITPRICE");
        
        CSITUNITPRICE = new JTextField();
        CSITUNITPRICE.setText("1254.40#15.00");
        
        lblCsmdd_9 = new JLabel();
        lblCsmdd_9.setText("CSMDD16");
        
        CSMDD16 = new JTextField();
        CSMDD16.setText("");
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsitunitprice, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITUNITPRICE, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsitproductname, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITPRODUCTNAME, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsitproductcode, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITPRODUCTCODE, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsststreet, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTSTREET1, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsstpostalcode, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTPOSTALCODE, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsstfirstname, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTFIRSTNAME, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsitproductsku_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITTOTALAMOUNT, 191, 191, 191))
        						.addComponent(lblCsmdd_7, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblCsstemail, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblCsstcity, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        								.addComponent(CSSTCITY, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        								.addComponent(CSSTEMAIL, 191, 191, 191))))
        					.addGap(50)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addComponent(lblCsstcountry, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTCOUNTRY, 191, 191, 191))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblCsstphonenumber, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblCsstlastname, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblCsststate, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        								.addComponent(CSSTSTATE, 191, 191, 191)
        								.addComponent(CSSTLASTNAME, 191, 191, 191)
        								.addComponent(CSSTPHONENUMBER, 191, 191, 191)))
        						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        							.addGroup(gl_panel_1.createSequentialGroup()
        								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        									.addComponent(lblCsitproductdescription, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblCsitproductsku, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblCsitquantity, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblCsmdd_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        									.addComponent(lblCsmdd_8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        									.addComponent(CSMDD15, 191, 191, 191)
        									.addComponent(CSMDD13, 191, 191, 191)
        									.addComponent(CSITQUANTITY, 191, 191, 191)
        									.addComponent(CSITPRODUCTSKU, 191, 191, 191)
        									.addComponent(CSITPRODUCTDESCRIPTION, 191, 191, 191)))
        							.addGroup(gl_panel_1.createSequentialGroup()
        								.addComponent(lblCsststreet_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(CSSTSTREET2, 191, 191, 191)))))
        				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(gl_panel_1.createSequentialGroup()
        						.addComponent(lblCsmdd_9, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(CSMDD16))
        					.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
        						.addComponent(lblCsmdd_5, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(CSMDD14, Alignment.TRAILING)
        							.addComponent(CSMDD12, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))))
        			.addContainerGap(83, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsstcity)
        						.addComponent(CSSTCITY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(4)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsstemail)
        						.addComponent(CSSTEMAIL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsstfirstname))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTFIRSTNAME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsstpostalcode))
        						.addComponent(CSSTPOSTALCODE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsststreet))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSSTSTREET1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(52)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsitproductcode))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITPRODUCTCODE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsitproductname))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITPRODUCTNAME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(9)
        							.addComponent(lblCsitproductsku_1))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSITTOTALAMOUNT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGap(3)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsstcountry)
        						.addComponent(CSSTCOUNTRY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(3)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsstphonenumber)
        						.addComponent(CSSTPHONENUMBER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsstlastname)
        						.addComponent(CSSTLASTNAME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsststate)
        						.addComponent(CSSTSTATE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsststreet_1)
        						.addComponent(CSSTSTREET2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(58)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSITPRODUCTDESCRIPTION, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsitproductdescription))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSITPRODUCTSKU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsitproductsku))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSITQUANTITY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsitquantity))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(CSITUNITPRICE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblCsitunitprice))
        			.addGap(62)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addGap(4)
        							.addComponent(lblCsmdd_5))
        						.addGroup(gl_panel_1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(CSMDD12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(6)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(CSMDD14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblCsmdd_7)))
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsmdd_6)
        						.addComponent(CSMDD13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCsmdd_8)
        						.addComponent(CSMDD15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addGap(7)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblCsmdd_9)
        				.addComponent(CSMDD16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(119, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);

        pack();
    }
    
    
    
    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Merchant", tfMerchantS.getText());
        parameters.put("OperationID", tfOperationIdS.getText());
        if(tpc !=null){
            Map<String, Object> a = tpc.getStatus(parameters);
            tpAnswerStatus.setText(printMap(a, ""));
        }else{
            tpAnswerStatus.setText("Run Config");
        }
    }//GEN-LAST:event_statusActionPerformed

    private void AAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAActionPerformed
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Security", tfSecurityAA.getText());
        parameters.put("Merchant", tfMerchantAA.getText());
        parameters.put("RequestKey", tfRequestKeyAA.getText());
        parameters.put("AnswerKey", tfAnswerKeyAA.getText());

        if(tpc !=null){
            Map<String, Object> a = tpc.getAuthorizeAnswer(parameters);
            tpAnswerAA.setText(printMap(a, ""));
        }else{
            tpAnswerAA.setText("Run Config");
        }
    }//GEN-LAST:event_AAActionPerformed
    
    private void btSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSARActionPerformed

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Session", tfSession.getText());
        parameters.put("Security", tfSecurity.getText());
        parameters.put("EncodingMethod", tfEncoding.getText());
        parameters.put("Merchant", tfMerchant.getText());
        parameters.put("OperationId", tfOperationId.getText());
        parameters.put("CurrencyCode", tfCurrencyCode.getText());
        parameters.put("AMOUNT", tfAmmount.getText());
        parameters.put("URL_OK", tfURLOk.getText());
        parameters.put("URL_ERROR", tfURLError.getText());
        parameters.put("EMAILCLIENTE", tfEMAILCLIENTE.getText());

        if(tpc !=null){
            Map<String, Object> a = tpc.sendAuthorizeRequest(parameters, getFraudControlParameters());
            tpResponse.setText(printMap(a, ""));
        }else{
            tpResponse.setText("Run Config");
        }

    }//GEN-LAST:event_btSARActionPerformed
    
        
    private void jBConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigureActionPerformed
        Map<String, String> wsdls = new HashMap<String, String>();
        wsdls.put(ElementNames.AuthorizeWSDL, tfAuthorizeWSDL.getText());
        
        Map<String, String> endpoints = new HashMap<String, String>();
        //endpoints.put(ElementNames.AuthorizeWSDL, tfAuthorizeEndpoint.getText());
        endpoints.put(ElementNames.Endpoint, tfOperationsEndpoiint.getText());
        
        Map<String, List<String>> auth = new HashMap<String, List<String>>();
        auth.put("Authorization", Collections.singletonList(tfAuthorization.getText()));
        try {
            tpc = new TodoPagoConector(wsdls, endpoints, auth, true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SampleUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBConfigureActionPerformed

    
    private static String printMap(Map<String, Object> pr, String tab){
    	
    	String output="";
    	
		List<String> keys = new ArrayList<String>();
		keys.addAll(pr.keySet());
		
		for(int i = 0; i<keys.size();i++){
			Map<String, Object> aux = new HashMap<String, Object>();
			Object tmp = pr.get(keys.get(i));
			
			if(tmp!=null && tmp.getClass().isInstance(aux)){
				output += (tab + "- " + keys.get(i)) + "\n\r";
				aux = (Map<String, Object>)(tmp);
				tab+="  ";
				output += printMap(aux, tab);
				
			}else{
				output += (tab + "- " + keys.get(i) + " : " + pr.get(keys.get(i))) + "\n\r";
			}		
		}
		return output;
	}
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleUI().setVisible(true);
            }
        });
    }
    
    
  //Parametros para el control de fraude
  	private Map<String, String> getFraudControlParameters() {
  		//Example
  		Map<String, String> parameters = new HashMap<String, String>();
  		
  		parameters.put("CSBTCITY", ((CSBTCITY.getText()==null)?"":CSBTCITY.getText())); //MANDATORIO.
  		parameters.put("CSBTCOUNTRY", ((CSBTCOUNTRY.getText()==null)?"":CSBTCOUNTRY.getText()));//MANDATORIO. Código ISO.
  		parameters.put("CSBTEMAIL", ((CSBTEMAIL.getText()==null)?"":CSBTEMAIL.getText())); //MANDATORIO.
  		parameters.put("CSBTPHONENUMBER", ((CSBTPHONENUMBER.getText()==null)?"":CSBTPHONENUMBER.getText()));//MANDATORIO.     
  		parameters.put("CSBTFIRSTNAME", ((CSBTFIRSTNAME.getText()==null)?"":CSBTFIRSTNAME.getText()));//MANDATORIO.      
  		parameters.put("CSBTLASTNAME", ((CSBTLASTNAME.getText()==null)?"":CSBTLASTNAME.getText()));//MANDATORIO.
  		parameters.put("CSBTPOSTALCODE", ((CSBTPOSTALCODE.getText()==null)?"":CSBTPOSTALCODE.getText()));//MANDATORIO.
  		parameters.put("CSBTSTATE", ((CSBTSTATE.getText()==null)?"":CSBTSTATE.getText()));//MANDATORIO
  		parameters.put("CSBTSTREET1", ((CSBTSTREET1.getText()==null)?"":CSBTSTREET1.getText()));//MANDATORIO.
  		parameters.put("CSBTSTREET2", ((CSBTSTREET2.getText()==null)?"":CSBTSTREET2.getText()));//MANDATORIO.
  		
  		parameters.put("CSBTIPADDRESS", ((CSBTIPADDRESS.getText()==null)?"":CSBTIPADDRESS.getText())); //MANDATORIO.       
  		parameters.put("CSBTCUSTOMERID", ((CSBTCUSTOMERID.getText()==null)?"":CSBTCUSTOMERID.getText())); //MANDATORIO.
  		parameters.put("CSPTGRANDTOTALAMOUNT", ((CSPTGRANDTOTALAMOUNT.getText()==null)?"":CSPTGRANDTOTALAMOUNT.getText()));//MANDATORIO.
  		parameters.put("CSPTCURRENCY", ((CSPTCURRENCY.getText()==null)?"":CSPTCURRENCY.getText()));//MANDATORIO.      
  		
  		parameters.put("CSMDD6", ((CSMDD6.getText()==null)?"":CSMDD6.getText()));//NO MANDATORIO.        
  		parameters.put("CSMDD7", ((CSMDD7.getText()==null)?"":CSMDD7.getText()));//NO MANDATORIO.        
  		parameters.put("CSMDD8", ((CSMDD8.getText()==null)?"":CSMDD8.getText())); //NO MANDATORIO.       
  		parameters.put("CSMDD9", ((CSMDD9.getText()==null)?"":CSMDD9.getText()));//NO MANDATORIO.       
  		parameters.put("CSMDD10", ((CSMDD10.getText()==null)?"":CSMDD10.getText()));//NO MANDATORIO.      
  		parameters.put("CSMDD11", ((CSMDD11.getText()==null)?"":CSMDD11.getText()));//NO MANDATORIO.
  		
  		switch(vertical.getSelectedIndex()){
	  		case 0:
	  			setRetail(parameters);
	  	  		break;
  		}
  		
  		return parameters;
  	}
  	
  	private void setRetail(Map<String, String> parameters){
  		parameters.put("CSSTCITY", ((CSSTCITY.getText()==null)?"":CSSTCITY.getText())); //MANDATORIO.
  		parameters.put("CSSTCOUNTRY", ((CSSTCOUNTRY.getText()==null)?"":CSSTCOUNTRY.getText()));//MANDATORIO. Código ISO.
  		parameters.put("CSSTEMAIL", ((CSSTEMAIL.getText()==null)?"":CSSTEMAIL.getText())); //MANDATORIO.
  		parameters.put("CSSTPHONENUMBER", ((CSSTPHONENUMBER.getText()==null)?"":CSSTPHONENUMBER.getText()));//MANDATORIO.     
  		parameters.put("CSSTFIRSTNAME", ((CSSTFIRSTNAME.getText()==null)?"":CSSTFIRSTNAME.getText()));//MANDATORIO.      
  		parameters.put("CSSTLASTNAME", ((CSSTLASTNAME.getText()==null)?"":CSSTLASTNAME.getText()));//MANDATORIO.
  		parameters.put("CSSTPOSTALCODE", ((CSSTPOSTALCODE.getText()==null)?"":CSSTPOSTALCODE.getText()));//MANDATORIO.
  		parameters.put("CSSTSTATE", ((CSSTSTATE.getText()==null)?"":CSSTSTATE.getText()));//MANDATORIO
  		parameters.put("CSSTSTREET1", ((CSSTSTREET1.getText()==null)?"":CSSTSTREET1.getText()));//MANDATORIO.
  		parameters.put("CSSTSTREET2", ((CSSTSTREET2.getText()==null)?"":CSSTSTREET2.getText()));//MANDATORIO.
  		
  		parameters.put("CSITPRODUCTCODE", ((CSITPRODUCTCODE.getText()==null)?"":CSITPRODUCTCODE.getText()));//CONDICIONAL
  		parameters.put("CSITPRODUCTDESCRIPTION", ((CSITPRODUCTDESCRIPTION.getText()==null)?"":CSITPRODUCTDESCRIPTION.getText()));//CONDICIONAL.     
  		parameters.put("CSITPRODUCTNAME", ((CSITPRODUCTNAME.getText()==null)?"":CSITPRODUCTNAME.getText()));//CONDICIONAL.  
  		parameters.put("CSITPRODUCTSKU", ((CSITPRODUCTSKU.getText()==null)?"":CSITPRODUCTSKU.getText()));//CONDICIONAL.      
  		parameters.put("CSITTOTALAMOUNT", ((CSITTOTALAMOUNT.getText()==null)?"":CSITTOTALAMOUNT.getText()));//CONDICIONAL.      
  		parameters.put("CSITQUANTITY", ((CSITQUANTITY.getText()==null)?"":CSITQUANTITY.getText()));//CONDICIONAL.       
  		parameters.put("CSITUNITPRICE", ((CSITUNITPRICE.getText()==null)?"":CSITUNITPRICE.getText()));
  		
  		parameters.put("CSMDD12", ((CSMDD12.getText()==null)?"":CSMDD12.getText()));//NO MADATORIO.     
  		parameters.put("CSMDD13", ((CSMDD13.getText()==null)?"":CSMDD13.getText()));//NO MANDATORIO.     
  		parameters.put("CSMDD14", ((CSMDD14.getText()==null)?"":CSMDD14.getText()));//NO MANDATORIO.      
  		parameters.put("CSMDD15", ((CSMDD15.getText()==null)?"":CSMDD15.getText()));//NO MANDATORIO.        
  		parameters.put("CSMDD16", ((CSMDD16.getText()==null)?"":CSMDD16.getText()));//NO MANDATORIO.
  		
  	}
}
