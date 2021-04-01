package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * scan, intList 객체선언
 * 생성자에서 객체 초기화
 * inputNum 메서드에서 키보드를통해 정수를 입력받아 intList에 추가
 * 입력받는 정수는 50~150 이내 유효성검사 수행
 */
public class InputServiceV2A {
	
	protected Scanner scan;
	protected List<Integer> intList ;
	
	// 클래스 영역에 선언된 변수는 맴버변수라고 하고 맴버 변수는 이 클래스의 
	// 어떤 method 에서든지 자유롭게 저장, 읽기가 가능하다.
	int num;
	
	public InputServiceV2A() {
		
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		// method { } 에 선언된 변수는 지역변수 라고 한다. 지역변수는  {  }를 벗어나면
		// 변수가 소멸된다. {  } 이 서로 다르면 이름은 같아도 절대 접근이 불가능
		// 맴버변수와 같은 이름으로 선언을 하면 맴버변수는 감추어져 접근이 불가능
		String num;
		
	}

	
	public void inputNum() {
		while(true) {
			System.out.println("50 ~ 150 범위의 정수를 입력해주세요");
			System.out.println("정수>>> ");
			int num = scan.nextInt();
			if(num > 50 && num < 150) {
				intList.add(num);
				break;
			} else {
				System.out.println("값은 50 ~ 150 범위내에서 입력해주세요");
			}
		}
	}// End intputNume
	
}
