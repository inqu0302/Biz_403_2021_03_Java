package com.callor.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.inqu0302.standard.InputService;
import com.inqu0302.standard.impl.InputServiceImplV2;

/*
 * 1. 메뉴를 보여주고 
 * 2. 성적입력 : 학생수의 제한이 없음
 * 		가. 학번
 * 		나. 학생이름 : inputName()
 * 		다. 과목별 성적	:inputScore()
 * 
 * 		가. 학생성적입력 : inputScore()시작
 * 			- 학번입력
 * 			- 이름입력
 * 			- 점수입력
 *		
 *		나. 학생의 이름을 입력하는 inputName() method는
 *			return type String 형 이기 때문에 학생이름을 입력받고
 *			입력받은 학생이름을 return 한다. 이 return 학생이름을
 *			inputScore()에서 변수에 담아 처리를 할수 있다. 	
 */
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
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("QUIT : 업무종료");
			System.out.println("=".repeat(50));
			System.out.print("메뉴 선택 :");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				System.out.println("업무 종료");
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
			} else {
				System.out.println("메뉴는 1,2,QUIT만 입력해주세요");
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
	
	private Integer scoreCheck(String subject) {
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

	@Override
	public void printScore() {
		// TODO 점수 출력
		System.out.println("=".repeat(80));
		System.out.println("성적 리스트 출력");
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int i = 0; i < scoreList.size() ; i ++) {
			ScoreVO vo = scoreList.get(i);
			System.out.printf("%s\t", vo.getNum());
			System.out.printf("%s\t", vo.getName());
			System.out.printf("%3d\t", vo.getKor());
			System.out.printf("%3d\t", vo.getEng());
			System.out.printf("%3d\t", vo.getMath());
			System.out.printf("%3d\t", vo.getTotal());
			System.out.printf("%3.2f\n", vo.getAvg());
		}
		System.out.println("=".repeat(80));
		return;
		
	}
	

	

}
