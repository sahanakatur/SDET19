package com.Generic;

import java.util.Date;
import java.util.Random;

public class Java_util {
	
	/**
	 * This class is to get the Date and random numbers
	 */
	
	
	
	/**
	 * This method is to get Random numbers
	 * @param key
	 * @return
	 */
	public int random_data() {
	
	Random ran = new Random();
	int random = ran.nextInt(100);
	//System.out.println(random);
	return random;
	
	}
	
	
	/**
	 * This method is to get current day
	 * //Wed Aug 04 18:05:32 IST 2021
		//0		1  2	3		4	5
		//Wed Aug 04 2021
	 * @return
	 */
	public String day()
	{
		Date dateObject = new Date();
	
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
	
		return arr[0];
		
	}
	
	/**
	 * This method is to get current month
	 * @return
	 */
	
	public String month()
	{
		Date dateObject = new Date();
	
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
	
		return arr[1];
		
	}
	
	/**
	 * This method is to get current year
	 * @return
	 */
	public String year()
	{
		Date dateObject = new Date();
	
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
	
		return arr[5];
		
	}
	
	/**
	 * THis method is to get current date
	 * @return
	 */
	
	public String date()
	{
		Date dateObject = new Date();
	
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
	
		return arr[2];
		
	}
	
	/**
	 * This method is to get current date in format
	 * @return
	 */
	
	public String currentdate()
	{
		Date dateObject = new Date();
	
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
		
		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year = arr[5];
		
		return day+" "+month+" "+todaysdate+" "+year;
		
	}
	

}
