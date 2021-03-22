package com.callor.controller;

import java.util.Random;

/*
 * JDK 에는 수없이 많은 도구들이 포함되어 있다.
 * Lego 블럭을 이용하여 작품을 만드는 것처럼 
 * JDK에 있는 도구들을 사용하여 프로젝트를 만들수 있다
 * JDk 에 있는 도구는 워낙 종류, 개수가 많아 파일이 커질수있다
 * 이런한 문제를 해결하기 위하여 Java에서는 가장 기본적인 도구 이외에는 
 * 모두 파일로 제공하고 있다 필요에 따라 import 명령으로 사용가능하다
 * 
 * import java.util.Random;
 * 현재 클래스에서 java.util 패키지의 Random 클래스를 사용하겠다는 선언
 * 
 * eclipse 에서 도구를 사용하기 위해서
 * import 하고자 할때는 
 * Crtl + Shift + o 를 눌러주면 된다.
 * 
 * 코드의 모양을 정렬하기
 * Ctrl + shift + F 
 * 
 * 
 */

public class Controller_06 {

	public static void main(String[] args) {

		/*
		 * 프로젝트에서 JDK의 클래스(도구)를 사용하는 방법
		 * 변수를 선언하고 초기화 하는것과 유사
		 * 
		 * int 키워드는 정수형 변수를 선언
		 * Integer 키워드는 정수형 변수를 선언
		 * 	실체는 키워드가 아닌 class임
		 * 
		 * 키워드는 java가 처음 탄생될때부터 만들어진 명령어
		 * class는 키워드처럼 사용이 되지만 java가 탄생이후에
		 * 	필요에따라 추가, 확장된 명령
		 * 
		 */
		
		Random rnd = null; // 선언
		rnd = new Random();// 초기화

		Random rnd1 = new Random();
		
		int num1 = 0;
		Integer num2 = 0 ;
		Integer num3 = new Integer(0);
		
		String str1 = "";
		String str2 = null;
		String str3 = new String();
		
		/*
		 * wrapper 클래스
		 * 	= 클래스이지만 변수선언처럼 사용할수 있는 도구들
		 * Integer, Long, Float, Double, Boolean, Charactor 들은
		 * 	int, long, float, double, boolean, char 키워드에 확장된 기능을 할수있도록
		 * 	만들어진 class 이다
		 * 
		 * 기본기능은 값을 저장하는 변수를 선언한다
		 * 기본기능에 별도로 확장된 추가명령을 수행할수 있도록 만들어진 도구
		 */
		
		
	}
}
