package com.collor.method;

import com.collor.method.service.NumberServiceV1;

public class Number_01 {

	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		nsV1.addNum(80, 38);
		nsV1.printNum();
	}
}
