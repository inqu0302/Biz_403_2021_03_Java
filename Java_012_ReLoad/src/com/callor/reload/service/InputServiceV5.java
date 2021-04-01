package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;



public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}
	
	public void inputNum() {
		System.out.println("정수 2개를 입력해주세요 ");
		System.out.println("첫번째 정수값이 두번째 정수값 보다 커야합니다.");
		Integer intNum1 = 0;
		while(true) {
			System.out.print("정수 1 >>> ");
			String strNum1 = scan.nextLine();
	
			
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자로만 입력");
				continue;
			}
			break;
		}
		
		Integer intNum2 = 0;
		while(true) {
			System.out.print("정수2 >>> ");
			String strNum2 = scan.nextLine();
			
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자로만 입력");
				continue;
			}
			
			if(intNum1 < intNum2) {
				System.out.println("정수1보다 작은수를 입력하세요");
				continue;
			}
			break;
		}
		
		NumberVO numberVO = new NumberVO();
		
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		
		numList.add(numberVO);
		
	}
	
	public void printNum() {
		for(int i =0 ; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.println("두 수의 합 :" + (vo.getNum1() + vo.getNum2()));
			System.out.println("두 수의 빼기 : " + (vo.getNum1() - vo.getNum2()));
		}
	}
	
	
	
}
