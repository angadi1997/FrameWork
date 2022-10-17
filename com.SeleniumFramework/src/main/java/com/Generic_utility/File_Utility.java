package com.Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	/**
	 * This method is used to launch the application
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author hp user
	 * @throws Throwable 
	 
	 */
	public String getPropertyKeyValues(String key) throws Throwable
	{
		//FileInputStream fis = new FileInputStream("./common_Data.properties.txt");
		FileInputStream fis = new FileInputStream( Ipathconstant.PROPERTYFILE_PATH);
		Properties pro = new Properties();
		pro.load(fis);
		String values=pro.getProperty(key);
		
		return values;
		
	}

}
