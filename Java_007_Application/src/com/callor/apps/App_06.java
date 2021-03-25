package com.callor.apps;

import com.callor.apps.service.EvenServiceV2;

public class App_06 {

	public static void main(String[] args) {
		
		EvenServiceV2 ev2 = new EvenServiceV2();
		
		ev2.makeNums();
		ev2.printEven();
		ev2.sumEven();
		
	}
}
