package com.callor.apps;

import com.callor.apps.service.EvenServiceV1;

public class App_05 {

	public static void main(String[] args) {
		
		EvenServiceV1 ev1 = new EvenServiceV1();
		
		ev1.makeNums();
		ev1.printNumbers();
	}
}
