package com.Generic;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson {
	
	/**
	 * This Method is to Read data from JSON File
	 * @param key
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	
	public String readdata_json(String key) throws IOException, ParseException 
	{
		FileReader inputfile = new FileReader(AutoConstants.Json_path);
		
		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);
		
		//type cast the object and just read the data
		@SuppressWarnings("rawtypes")
		HashMap jobj = (HashMap) obj;
		
		String value = jobj.get("username").toString();
		
		System.out.println(value);
		
		return value;
		
	}

}


