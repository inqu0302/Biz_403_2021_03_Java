package com.collor.method.service;

/*
 * inputServiceV2 클래스의 inputValue() method에 
 * "국어", 0, 100 값을 전달한 후 
 * return 값이 null 이면 종료, 정수값이면 점수 : ?? 형식으로 출력
 */
public class ScoreServiceV2 {
	
	/*
	 * InputServiceV2 클래스를 활용하는 method가 2개 이상일 경우
	 * 모든 변수, 객체를 클래스 영역(멤버 변수 영역)에 선언하자
	 * 	그리고 생성자에서 초기화 하여 사용하도록 한다. 
	 */
	
	protected InputServiceV2 inService;
	
	public ScoreServiceV2(){
		inService = new InputServiceV2();
	}
	public void inputScore() {
		// InputServiceV2 클래스를 활용한 method가 한곳 뿐일때는 
		// "method 지역변수 영역"에 선언하여 사용하면 된다
		
//		InputServiceV2 inService = new InputServiceV2();
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
		} else {
			System.out.printf("국어 점수 : %d",intKor);
		}
	}

}