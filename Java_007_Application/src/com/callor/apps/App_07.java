package com.callor.apps;

import com.callor.apps.service.EvenServiceV3;

public class App_07 {

	public static void main(String[] args) {
		
		EvenServiceV3 ev3 = new EvenServiceV3();
		
		ev3.makeNums();
		ev3.printEven();
		ev3.sumEven();
		
	}
}
