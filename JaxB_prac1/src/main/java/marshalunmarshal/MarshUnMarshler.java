package marshalunmarshal;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import thakur.prasad.order.Order;

public class MarshUnMarshler {
	public static void main(String []a)
	{
		try {
			JAXBContext context=JAXBContext.newInstance(thakur.prasad.order.Order.class);
			Marshaller marsh=context.createMarshaller();
			Order order=new Order();
			order.setItemId(1);
			StringWriter writer=new StringWriter();
			marsh.marshal(order, writer);
			System.out.println(writer.toString());
			Unmarshaller unMarshall=context.createUnmarshaller();
			Order ordr=(Order)unMarshall.unmarshal(new StringReader(writer.toString()));
			System.out.println(ordr.getItemId());
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		
	}

}
