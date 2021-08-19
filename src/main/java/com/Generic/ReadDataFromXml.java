package com.Generic;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadDataFromXml {
	
	/**
	 * This Method is to Read data from XML File
	 * @param key
	 * @return
	 * @throws DocumentException
	 */
	
	public String readdata_xml(String key) throws DocumentException
	{
		File inputFile = new File(AutoConstants.xml_path);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputFile);
		String value =doc.selectSingleNode(key).getText();
			
		return value;
	}

}
