package com.callor.reload;

import com.callor.reload.service.InputServiceV1;
import com.callor.reload.service.InputServiceV1A;

public class NumberEx_01 {

	public static void main(String[] args) {
		
		InputServiceV1A isV1A = new InputServiceV1A();
		isV1A.inputNum();
		isV1A.inputNum();
		isV1A.inputNum();
		isV1A.printNum();
		
		InputServiceV1 isV1 = new InputServiceV1();
		isV1.inputNum();
		isV1.printNum();
		
		
				
	}
}
