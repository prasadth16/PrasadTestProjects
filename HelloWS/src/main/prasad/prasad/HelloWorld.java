package prasad;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {
	@WebMethod
	public String returnHello()
	{
		return "Hellow World";
	}

}
