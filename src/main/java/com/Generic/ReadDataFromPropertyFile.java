package com.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	
	/**
	 * This Method is to Read data from Property File
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public String getData(String key) throws FileNotFoundException, IOException
	{
		Properties P = new Properties();
		P.load(new FileInputStream(AutoConstants.propertyFile_path));
		return P.getProperty(key);
		
	}
	
	public String getData_salesstage(String key) throws FileNotFoundException, IOException
	{
		Properties P = new Properties();
		P.load(new FileInputStream(AutoConstants.sales_stage_Path));
		return P.getProperty(key);
		
	}
	
	

			

	
}
