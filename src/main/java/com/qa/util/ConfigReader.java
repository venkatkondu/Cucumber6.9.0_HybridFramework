package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	public Properties init_Properties()// pass the path later on I will update About the path 
	{
		prop=new Properties();
		
		File file=new File("./src/test/resources/config/config.properties");
		FileInputStream inStream;
		try {
			inStream = new FileInputStream(file);System.out.println("Properties file  loaded from the path");

			prop.load(inStream);System.out.println("Properties file is loaded from the inStream");
		} catch (FileNotFoundException e) {
			System.out.println("File is not loaded  from the path check the path of the file :");
			e.printStackTrace();
			
			//throw new Exception();
			
		} catch (IOException e) {
			System.out.println("Properties file is not loaded from the inStream check ::");
			e.printStackTrace();
		}
		
		return prop;
		
		
	}
	

}
