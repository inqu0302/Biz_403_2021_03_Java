package com.callor.method.service;

/*
 * (국어, 영어,수학,과학,국사)요소를 갖는 문자배열
 * InputService클래스의 inputValue() method를 호출하여 점수를입력
 */
public class NumberServiceV7 {

	String subject[] = { "국어", "영어", "수학", "과학", "국사" };

	public void inputScore() {
		InputService ipService = new InputService();
		Integer score;

		while (true) {
			for (int i = 0; i < subject.length; i++) {
				score = ipService.inputValue(subject[i]);
				if (score == null) {

					System.out.println("입력값 범위 초과");
					continue;
				} else if (score > 100 || score < 0) {
					return;
				}
			}
		}
	}
}
