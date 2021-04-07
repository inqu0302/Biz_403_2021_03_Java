package com.collor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.collor.method.model.ScoreVO;

/*
 * 과목명을 subject = {"국어,"영어","수학"} 배열에 선언
 * 성적 정보를 저장할 List<ScoreVO> scoreList를 생성
 * inputScore() method 를 선언하고
 * InputServiceV2의 inputValue() method를 사용하여 5명의 점수를 입력
 * 입력받은 점수를 ScoreVO 객체로 생성후 scoreList에 add
 */

public class ScoreServiceV6 {

	protected String[] subject;
	protected Integer[] scores;
	ScoreVO scoreVO;
	InputServiceV2 inService;
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
	
	public ScoreServiceV6() {

		subject = new String[] {"국어", "영어", "수학"};
		scores = new Integer[subject.length];
		
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		
		
		for(int i = 0 ; i < 5 ; i++) {
			scoreVO = new ScoreVO();
			for(int sub = 0 ; sub < subject.length ; sub++) {
				scores[sub] = inService.inputValue((i+1) + "번 학생 " + subject[sub], 0, 100);
				if(scores[sub] == null) {
					System.out.println("입력을 종료합니다.");
					return;
				}
			}
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			scoreList.add(scoreVO);
			
		}
		
		this.printScore();
		
	}
	
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("성적 출력 리스트");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t");
		System.out.println("=".repeat(50));
		
		for (int i = 0; i < scoreList.size() ; i++) {
			System.out.print(i+1 + "\t");
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
		}
	}
	
}
