package com.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebService;

import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
@WebService(endpointInterface = "com.demo.service.FileUpload", serviceName = "FileUpload")
public class FileuploadImpl 	implements FileUpload{

	@Override
	public void uploadFile(DataHandler datahandler) throws IOException{
		// TODO Auto-generated method stub
		//File file=new File("C:/PrasadPersonal/Web services development/Project examples/mtom/HOWTO.txt");
		OutputStream fileoutputstream=new FileOutputStream("C:/PrasadPersonal/Web services development/HOWTO.txt");
		InputStream fileinptStream=datahandler.getInputStream();
		byte[]b=new byte[100000];
		int bytesRead=0;
		while((bytesRead=fileinptStream.read(b))!=-1)
		{
			fileoutputstream.write(b,0,bytesRead);
		}
	}

	@Override
	public DataHandler downloadFile()  {
		// TODO Auto-generated method stub
		URL url;
		DataHandler datahandler=null;
		try {
			//url = new URL("C:/PrasadPersonal/Web services development/HOWTO.txt");
			InputStream infile=new FileInputStream("C:/PrasadPersonal/Web services development/HOWTO.txt");
			
			datahandler=new DataHandler(new FileDataSource("C:/PrasadPersonal/Web services development/HOWTO.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datahandler;
	}

}
