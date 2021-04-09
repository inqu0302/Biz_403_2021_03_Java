package com.collor.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속받게 된다.
public class ScoreServiceV2 extends ScoreServiceImplV1A {
	/*
	 * inputScore() method를 재정의 학생의 학번을 입력받을 때 이미 입력된(추가된) 학생일 경우 이미 입력된 학생임을 메시지로
	 * 보여주고 다시 입력받는다.
	 */

	public void inputScore() {
		// TODO 점수 입력

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}
		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난후 한 과목이라도 QUIT를 입력하면 종료하는 코드이다 만약 국어과목에서
		 * QUIT를 입력하여도 영어,수학 점수를 입력받는 prompt가 나타나고 3과목을 모두 통과한 후 입력종료가 된다
		 */
		if (intKor == null || intEng == null || intMath == null) {
			return;
		}

		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// vo에 담긴 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);

		return;

	}

	private String inputNum() {
		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면 정수값이 intNum에 담길것이고
		// QUIT를 입력했으면 null값이 intNum에 담길것이다.
		
		String strNum = null;
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);
			
			// intNum에 null값이 담겨있으면 종료하고 메뉴로 돌아간다.
			if (intNum == null) {
				return null;
			}
			
			// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001,002)으로 변환을하자
			// String.format("%3d", 1) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기
			// " 1"
			// String.format("%03d", 1) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정령하고 빈칸에
//												0을 채워라 "001"
			strNum = String.format("%03d", intNum);
			Boolean bYes = false;
			for(int index = 0; index < scoreList.size() ; index++) {
				if (scoreList.get(index).getNum().equals(strNum)) {
					System.out.println("이미 입력된 학생입니다.");
					bYes = true;
					;
				}
			}
			if (bYes) {
				continue;
			}
			break;
			
		}
		
		
		return strNum;

	}

	private String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method;
		
		while(true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT : 입력종료)");
			System.out.println(">> ");
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return null;
			} else if(strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해야 합니다.");
				continue;
			}
			return strName;
		}
	}
}
