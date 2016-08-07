package com.demo.service;

import java.io.IOException;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public interface FileUpload {
	
	public void uploadFile(@WebParam(name="file")DataHandler datahandler) throws IOException;
	
	public DataHandler downloadFile();
}
