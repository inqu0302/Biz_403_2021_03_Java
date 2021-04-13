package com.callor.score.service;

import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.inqu0302.standard.InputService;
import com.inqu0302.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServcieImplV1{

	protected InputService inService;
	protected Scanner scan;
	
	public ScoreServiceImplV2() {
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
	}
	@Override
	public void inputScore() {
		
		String num = this.inputNum();
		if(num == null) {
			return;
		}
		
		Integer kor = inService.inputValue("국어", 0, 100);
		if(kor == null) {
			return;
		}
		
		Integer eng = inService.inputValue("영어", 0, 100);
		if(eng == null) {
			return;
		}
		
		Integer math = inService.inputValue("수학", 0, 100);
		if(math == null) {
			return;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setKor(kor);
		scoreVO.setEng(eng);
		scoreVO.setMath(math);
		
		scoreList.add(scoreVO);
		
		
	}
	
	private String inputNum() {
		
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum == null) {
			return null;
		}
		
		String strNum = String.format("2021%3d", intNum);
		return strNum;
	}
	
	private String inputName(String strNum) {
		
		System.out.println(strNum + " 의 학생 이름을 입력해주세요.(QUIT : 입력종료)");
		System.out.print(">>> ");
		String strName = scan.nextLine();
		if(strName.equals("QUIT")) {
			return null;
		}else {
			return strName;
		}
	}
	
	
	
	

}
