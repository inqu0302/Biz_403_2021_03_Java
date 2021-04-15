package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.stuedent.service.StudentService;
import com.callor.stuedent.service.impl.StudentsServiceImplV1A;
import com.callors.student.model.StudentVO;
import com.inqu0302.standard.InputService;
import com.inqu0302.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	protected InputService inService;
	protected StudentService stService;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
		inService = new InputServiceImplV1();
		stService = new StudentsServiceImplV1A();

	}

	@Override
	public void insertScore() {
		// TODO 학번, 국어, 영어, 수학 점수를 입력받는 메서드
		// 동일 학번은 입력될 수 없다.
		String strNum = null;
		while (true) {
			System.out.println("학생의 성적을 입력받습니다.");

			strNum = this.inputNum();
			if (strNum == null)
				return;
			StudentVO stVO = stService.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생입니다.");
				System.out.println("학번을 다시 확인해주세요");
				continue;
			}
			System.out.println("=".repeat(50));
			System.out.printf("학번 : %s\t", stVO.getNum());
			System.out.printf("이름 : %s\t", stVO.getName());
			System.out.printf("학과 : %s\t", stVO.getDept());
			System.out.printf("학년 : %s\t", stVO.getGrade());
			System.out.printf("주소 : %s\n", stVO.getAddress());
			System.out.println("=".repeat(50));
			System.out.println("학생정보가 맞습니까?");
			System.out.println("맞으면 : Enter, 틀리면 : NO");
			System.out.print(">>  ");
			String yesNo = scan.nextLine();
			if (yesNo.equals("NO")) {
				continue;
			}
			break;
		}

		Integer kor = inService.inputValue("국어", 0, 100);
		if (kor == null)
			return;

		Integer eng = inService.inputValue("영어", 0, 100);
		if (eng == null)
			return;

		Integer math = inService.inputValue("수학", 0, 100);
		if (math == null)
			return;

		ScoreVO score = new ScoreVO();

		score.setNum(strNum);
		score.setKor(kor);
		score.setEng(eng);
		score.setMath(math);
		scoreList.add(score);

		this.printScore();
	}

	public String inputNum() {
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null)
				return null;
			String strNum = String.format("%05d", intNum);

			boolean isTrue = false;

			ScoreVO vo = new ScoreVO();
			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				if (scoreList.get(i).getNum().equals(strNum)) {
					System.out.println("학번은 중복될수 없습니다.");
					isTrue = true;
					break;
				}
			}

			if (isTrue)
				continue;

			return strNum;

		}

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		ScoreVO scVO = scoreList.get(0);
		
		StudentVO stVO = stService.getStudent(scVO.getNum());
		
		System.out.printf("%s\t", scVO.getNum());
		System.out.printf("%s\t", stVO.getName());
		System.out.printf("%s\t", stVO.getDept());
		System.out.printf("%s\t", stVO.getGrade());
		System.out.printf("%d\t", scVO.getKor());
		System.out.printf("%d\t", scVO.getEng());
		System.out.printf("%d\t", scVO.getMath());
		System.out.printf("%d\t", scVO.getTotal());
		System.out.printf("%3.2f\n", scVO.getAvg());
		
		System.out.println("=".repeat(80));
		

	}

}
