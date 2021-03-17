package com.callor.values;

public class Print_01 {

	public static void main(String[] args) {
		
		
		/*
		 * Console에 출력하는 명령문
		 * 
		 * println() 일 경우
		 * 빈라인(Enter)만 출력하라
		 * new line 기호, 새로 줄바꿈 하기
		 */
		
		System.out.println("A");
		System.out.println();
		System.out.println("B");
		
		/*
		 * print() 은 괄호안이 비어있는 채로 실행할수 없다
		 * 줄바꿈 없이 값을 출력한다
		 * 
		 * 예) 34가 Console 에 출력된다
		 * 
		 */
		
		System.out.print(3);
		System.out.print(4);
				
		// 한줄에 연속된 결과를 출력한후
		// 다음줄에 다른 결과를 출력하고 싶으면
		// println()을 한번 실행해 준다
		
		System.out.println();
		System.out.println("===============");
		
		/*
		 * printf()
		 * form(형식)에 맞추어서 출력하는 명령문
		 * 
		 * printf("형식 문자열", 값들...)
		 * %와 함께 시작되는 기호들을 사용하여
		 * 출력되는 문자열 형식을 만들고
		 * 실제 값들을 채워넣어서 문자열을 완성하여
		 * 출력하는 명령문
		 *   
		 */
		System.out.printf("%d + %d = %d\n ", 3,4,3+4);
		System.out.printf("%d X %d = %d", 3,3,3*3);
		
		/*
		 * printf() 는 형식에 맞추어서 출력하고자 할때
		 * %d : 정수를 표시하는 형식 기호
		 * %s : 문자열을 표시하는 형식 기호
		 * %f : 실수를 표시하는 형식 기호
		 */
	
	}
}
