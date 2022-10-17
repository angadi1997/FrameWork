package com.Generic_utility;

import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to launch the application
	 * @param key
	 * @return
	 * @throws Throwable
	 */
public int getRanDomNum(){
		
		java.util.Random ran=new Random();
		int RanNum=ran.nextInt(1000);
		return RanNum;
		
	}
}
