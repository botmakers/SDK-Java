package main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.util.Map;
import ar.com.todopago.api.TodoPagoConector;
import mocks.GetByRangeDateTimeMockParameters;

public class GetByRangeDateTimeTest {

	private Map<String,String> paramsGetByRangeDateTime=GetByRangeDateTimeMockParameters.getBRYParameters();
	private Map<String,Object> getByRangeDateTimeOKMocked=GetByRangeDateTimeMockParameters.getBRYOKResponse();
	
	@Test
	public void GetByRangeDateTimeOkTest(){
		TodoPagoConector tpc = mock(TodoPagoConector.class);
	
		when(tpc.getByRangeDateTime(paramsGetByRangeDateTime)).thenReturn(getByRangeDateTimeOKMocked);
			
		assertEquals(true,tpc.getByRangeDateTime(paramsGetByRangeDateTime).containsKey("OperationsCollections"));
		
		@SuppressWarnings("unchecked")
		Map<String,Object> oc=(Map<String,Object>)tpc.getByRangeDateTime(paramsGetByRangeDateTime).get("OperationsCollections");
		
		assertEquals(true,oc.containsKey("RESULTCODE"));
		assertEquals(true,oc.containsKey("RESULTMESSAGE"));		
		assertEquals(-1,oc.get("RESULTCODE"));
		assertEquals("APROBADA",oc.get("RESULTMESSAGE"));
	}
}
