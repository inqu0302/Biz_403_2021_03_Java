package com.callor.app.service;

import com.inqu0302.standard.InputService;
import com.inqu0302.standard.impl.InputServiceImplV1;

/*
 * InputService interface를 활용하여
 * 한 학생의 국어, 영어, 수학점수를 입력받고
 * 총점과 평균을 계산하여 출력
 * 단, 점수는 0~100 까지만 입력가능
 */
public class ScoreServiceV1 {

	InputService isV1;
	Integer kor;
	Integer eng;
	Integer math;

	public ScoreServiceV1() {

		isV1 = new InputServiceImplV1();
		kor = null;
		eng = null;
		math = null;
	}

	public void inputScore() {

		kor = isV1.inputValue("국어", 0, 100);
		if(kor == null) {
			return;
		}
		
		eng = isV1.inputValue("영어", 0, 100);
		if(eng == null) {
			return;
		}
		
		math = isV1.inputValue("수학", 0, 100);
		if(math == null) {
			return;
		}
		
		this.printScore();
		
	}
	
	public void printScore() {
		
		Integer sum = kor + eng + math;
		float avg = (float)sum / 3 ;
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		System.out.printf("%d\t",kor);
		System.out.printf("%d\t",eng);
		System.out.printf("%d\t",math);
		System.out.printf("%d\t",sum);
		System.out.printf("%3.2f\n",avg);
		System.out.println("=".repeat(50));
	}
}
