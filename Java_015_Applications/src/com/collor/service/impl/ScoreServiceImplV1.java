package com.collor.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.collor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected Scanner scan;
	ScoreVO scoreVO ;
	List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void selectMenu() {
		// TODO 메뉴선택
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("메뉴 선택");
			System.out.println("=".repeat(50));
			System.out.println("1. 점수 입력");
			System.out.println("2. 점수 출력");
			System.out.println("QUIT : 입력종료");
			System.out.println("=".repeat(50));
			System.out.print("메뉴 선택 :");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				return;
			}
			Integer intMenu = null;
			try {
				 intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴를 확인해주세요");
				continue;
			}
			if(intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}
		
	}

	@Override
	public String inputName() {
		// TODO 이름 입력
		scoreVO = new ScoreVO();
		System.out.println("학번을 입력해주세요 (형식 : 000) (QUIT : 입력취소)");
		System.out.print(">>> ");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return null;
		}
		
		System.out.println("이름을 입력해주세요(QUIT : 입력취소)");
		System.out.print(">>> ");
		String strName = scan.nextLine();
		if(strName.equals("QUIT")) {
			return null;
		}
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		
		
		this.inputScore();
		return null;
	}

	@Override
	public void inputScore() {
		// TODO 점수 입력
		
		Integer intKor = null;
		intKor = this.scoreCheck("국어");
		if(intKor == null) {
			return;
		}
		scoreVO.setKor(intKor);
		
		Integer intEng = null;
		intEng = this.scoreCheck("영어");
		if(intEng == null) {
			return;
		}
		scoreVO.setEng(intEng);
		
		Integer intMath = null;
		intMath = this.scoreCheck("수학");
		if(intMath == null) {
			return;
		}
		scoreVO.setMath(intMath);
		
		
		scoreList.add(scoreVO);
		
		return;
	}//end InputScore

	@Override
	public void printScore() {
		// TODO 점수 출력
		System.out.println("=".repeat(80));
		System.out.println("성적 리스트 출력");
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int i = 0; i < scoreList.size() ; i ++) {
			System.out.printf("%s\t", scoreList.get(i).getNum());
			System.out.printf("%s\t", scoreList.get(i).getName());
			System.out.printf("%3d\t", scoreList.get(i).getKor());
			System.out.printf("%3d\t", scoreList.get(i).getEng());
			System.out.printf("%3d\t", scoreList.get(i).getMath());
			System.out.printf("%3d\t", scoreList.get(i).getTotal());
			System.out.printf("%3.2f\n", scoreList.get(i).getAvg());
		}
		System.out.println("=".repeat(80));
		return;
		
	}
	
	public Integer scoreCheck(String subject) {
		// TODO 점수의 유효성 검사
		while(true) {
			System.out.println("-".repeat(50));
			System.out.println(subject + "점수를 입력해주세요(QUIT : 입력종료)");
			System.out.print(">> ");
			String strScore = scan.nextLine();
			if(strScore.equals("QUIT")) {
				return null;
			}
			Integer intScore = null;
			try {
				intScore = Integer.valueOf(strScore);
			} catch (Exception e) {
				System.out.println("QUIT 또는 정수를 입력해주세요");
				continue;
			}
			if (intScore > 100 || intScore < 0) {
				System.out.println("점수의 범위는 0 ~ 100 입니다.");
				continue;
			}
			return intScore;
		}
	}// end scoreCheck
	

}
