package com.collor.app;

import com.collor.app.service.InputServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		
		InputServiceV1 isV1 = new InputServiceV1();
		
		isV1.inputValue("국어");
		isV1.inputValue("국어", 0);
		isV1.inputValue("국어", 0, 100);
	}
}
