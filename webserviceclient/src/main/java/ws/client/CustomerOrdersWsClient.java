package ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider.Service;

import com.thakur.dattaprasad.webserviceclient.com.bharath.ws.trainings.CustomerOrderService;
import com.thakur.dattaprasad.webserviceclient.com.bharath.ws.trainings.CustomerOrdersPortType;
import com.thakur.dattaprasad.webserviceclient.com.bharath.ws.trainings.GetOrdersreq;
import com.thakur.dattaprasad.webserviceclient.com.bharath.ws.trainings.Getordersresponce;

public class CustomerOrdersWsClient {
	public static void main(String[] a) {
		try {
			CustomerOrderService service = new CustomerOrderService(
					new URL(
							"http://localhost:8080/mywsdlfstwebservice/services/customerOrderService?wsdl"));
			CustomerOrdersPortType port = service.getCustomerOrdersPort();
			GetOrdersreq orderRequest = new GetOrdersreq();
			orderRequest.setCustomerID("1");
			Getordersresponce orderResponse = port.getOrders(orderRequest);
			System.out.println(orderResponse.getCustomerID());	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
