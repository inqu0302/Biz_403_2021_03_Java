package com.collor.method.service;

/*
 * addNum() method는 두개의 정수를 매개변수로 받는다
 * 매개변수로 받은 2개의 정수의 합을 계산하고 합의 결과가 짝수이면
 * 계산결과를 return 하고 그렇지 않으면 null을 return한다.
 */

/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)에서는
 * 한개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 
 * 선언할수 없다.
 * 
 * 객체지향 프로그램언어(Java)에서는 한개의 클래스(파일)내에서
 * 같은 이름의 함수(method)를 중복하여 선언할 수 있다.
 * 한개의 클래스에서 method를 중복선언 할 수 있다. 
 * 
 * 단, 배개변수가 달라야 가능 매개변수의 type, 개수, 순서가 다르면
 * 		같은 이름의 method를 중복 선언할 수 있다.
 */

public class NumberServiceV1 {
	
	Integer num1 = 0;
	Integer num2 = 0;
	
	/*
	 * method 이름은 addNum()
	 *  두 개의 정수를 매개변수로 받는다
	 *  누구나 어디선가 addNum()을 호출할때는 객체.addNum()
	 *  2개의 정수를 전달하게 하겠다 라는 선언 객체.addNum(100, 200)
	 *  두개의 정수를 전달받기 위해서는 method가 준비를 해야한다.
	 *  	method 의 () 안에 변수를 선언한다.
	 *  	두개의 변수를 선언하자
	 *  
	 *  return 값 형식의 명령이 있으려면 void가 아닌 
	 *  	return type을 지정해 주어야 한다
	 *  
	 *  단순히 정수만 return을 하는 경우는 int type으로 가능하나
	 * 	여기에서는 조건에따라 null값을 return 해야하는 경우도 있기때문에
	 * 	int type이 아닌 Integer type으로 설정해야 한다.   
	 */
	
	public Integer addNum(int num1,int num2) {
		// TODO 두 정수의 합이 짝수인가 판별하는 method
		// 어떤 연산을 수행하고 연산결과에 따라 return 등을 수행하는 경우
		// 	연산된 결과를 변수에 담아놓고 이후 코드를 진행하자
		
		int sum = num1 + num2 ;
		if ( sum % 2 == 0) {
			return sum;
//		}else {
		}
		return null;
		
		// C언어와 같은 함수형 언어에서는 함수를 끝내는 return 문은
		//	한번만 쓰자라는 전통적인 패턴이있다. 전통적인 패턴을 지키는 코드 예
//		Integer sum = null;
//		if( (num1 + num2) % 2 == 0) {
//			sum = num1 + num2;
//		}
//		return sum;
	}// addNum(int num1, int num2) 가 끝나는곳
	
	/*
	 * Java의 mhetod는 매개변수에 따라 호출하는 방식이 달라진다.
	 * 
	 * 만약 addNum(정수, 정수) 방식으로 호출하려면 
	 * 		addNum( int num1, int num2 ), addNum( long num1, long num2) 형식으로 method를 선언해야 한다.
	 * 만약 addNum(실수, 실수) 방식으로 호출하려면
	 * 		adNum (float num1, float num2), addNum( double num1, double num2) 형식으로 method를 선언해야 한다.
	 * 
	 * method를 호출할때 전달하는 데이터의 type에 맞도록 method가 미리 만들어져 있어야 한다.
	 */
	public Float addNum(float num1, float num2) {
		// TODO 두 실수를 전달받아 짝수인가 팔변하는 코드
		
		float sum = num1 + num2;
		if( sum % 2 == 0) {
			return sum;
		}
		//method 코드가 아직 작성되지 않았을때 문법오류가 나는 것을 방지하는 임시코드
		return null;
	}
	
	// 매개변수의 순서가 다른경우 중복가능
//	public Float addNum(int num1, float num2) {
//		return null;
//	}
//	public Float addNum(float num1, int num2) {
//		return null;
//	}
}
