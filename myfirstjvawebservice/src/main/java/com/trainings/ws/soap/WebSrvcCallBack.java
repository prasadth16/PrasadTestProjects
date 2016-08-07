package com.trainings.ws.soap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class WebSrvcCallBack implements CallbackHandler{
	
	private Map<String,String> passwords=new HashMap<String, String>();
	
	public WebSrvcCallBack()
	{
		passwords.put("Prasad", "Saumya@25");
		passwords.put("Trupti", "Shubham@14");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		// TODO Auto-generated method stub
		for (Callback objct:callbacks)
		{
			WSPasswordCallback pc=(WSPasswordCallback)objct;
			String identifier=passwords.get(pc.getIdentifier());
			if(identifier !=null)
			pc.setPassword(identifier);
		}
	}
	
	

}
