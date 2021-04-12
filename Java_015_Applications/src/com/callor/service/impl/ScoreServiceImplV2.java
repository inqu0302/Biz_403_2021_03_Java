package com.callor.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속받게 된다.
public class ScoreServiceImplV2 extends ScoreServiceImplV1A {
	/*
	 * inputScore() method를 재정의 학생의 학번을 입력받을 때 이미 입력된(추가된) 학생일 경우 이미 입력된 학생임을 메시지로
	 * 보여주고 다시 입력받는다.
	 */

	/*
	 * scoreList에 성적정보를 추가할 때 학번을 입력받을텐데
	 * 이미 등록된 학번 정보가 있으면 그 학번은 추가하지 못하도록
	 * 하는 코드를 작성한다.
	 * 
	 * V1의 inputNum() method를 재 정의 한다.
	 * V1의 inputNum() method를 재 정의 하기 위해서
	 * 		private을 protected로 변경했다. 
	 */
	protected String inputNum() {

		String strNum = null;
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);

			// intNum에 null값이 담겨있으면 종료하고 메뉴로 돌아간다.
			if (intNum == null) {
				return null;
			}

			strNum = String.format("2021%03d", intNum);
			
			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */
			
//			Boolean bYes = false;
			int index = 0;
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if (vo.getNum().equals(strNum)) {
					
//					
//					bYes = true;
					break;
				}
			}
//			if (bYes) {
			if(index < scoreList.size()) {
				System.out.println("이미 입력된 학생입니다.");
				continue;
			}
			break;

		}

		return strNum;

	}

}
