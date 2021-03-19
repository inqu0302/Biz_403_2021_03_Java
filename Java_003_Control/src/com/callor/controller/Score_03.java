package com.callor.controller;

public class Score_03 {

	public static void main(String[] args) {
		
		int intKor = 87;
		int intEng = 66;
		
		int intSum = intKor + intEng;
		System.out.println("총점 : " + intSum);

		// 오차가 발생한 평균 계산
		int intAvg = intSum / 2;

		System.out.println("평균 : " + intAvg);
		
		/*
		 * 과목의 평균을 계산할 떄 소수점 이하 오류가 발생하여 
		 * 소수점 이하 계산을 살리기 위해 평균을 저장할 변수를 float형으로 선언하였지만
		 * 여전히 계산된 결과는 소수점이하 값이 0으로 나타남
		 * 
		 * 이 상황은 대입 연산자의 성질 때문
		 * 대입 연산자가 나오면 항상 오른쪽의 연산식이 먼저 실행된다
		 * 결과적으로 정수 / 정수 는 결과가 정수이며 이미 계산 결과에서 소수점 이하의 값이 없는상태임
		 * 
		 * 정확한 평균을 계산하기 위해서는 계산전 실수형으로 값들을 형변환 시켜주어야 한다
		 */
		//평균을 저장할 변수를 float형으로 
		float floatAvg = intSum / 2;
		
		/*
		 * intSum / 2 의 연산식에서는 정수형 변수 intSum을 float 형으로 강제형 변환하면
		 * 젯수(나누는수) 2도 실수 2.0으로 변환된다
		 * 결국 실수 / 실수 연산이 되어 소수점 이하 값을 포함하는 계산 결과가 만들어진다 
		 */
		// 가장많이 쓰는 코드
		floatAvg = (float) intSum / 2;
		floatAvg = intSum / 2.0F;
		
		// 가능은 하지만 잘 안쓰는 코드
		floatAvg = intSum / (float)2; //이론상 가능은하나 거의안씀
		floatAvg = (float) intSum / (float) 2;
		floatAvg = (float) intSum / 2.0F;
		
		System.out.println("평균 : " + floatAvg);
		
		
		
	}
}
