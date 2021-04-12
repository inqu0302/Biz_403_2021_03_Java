package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.inqu0302.standard.impl.InputServiceImplV1;
import com.inqu0302.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService{
	
	protected MenuServiceImplV1 menuService;
	protected List<ScoreVO> scoreList;
	protected InputServiceImplV1 inService;
	protected Scanner scan;
	
	public ScoreServiceImplV2() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	
	@Override
	public void selectMenu() {
		
		/*
		 * 보통 멤버변수(클래스 영역에 선언된 변수들) 객체는
		 * 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여
		 * 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 
		 * 객체를 생성하는 코드를 작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		
		scoreMenu.add("성적 입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");

		menuService = new MenuServiceImplV1("빛고을 고교 성적 처리", scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if (menu == 2) {
				this.printScroe();
			}else if (menu == 3) {
				this.saveScore(); 
			}
			
		}
	}

	@Override
	public void inputScore() {
		// 학번입력, 이름입력, 과목별 성적입력
		// ScoreVO 객체에 담고, list에 추가
		// = ScoreVO 클래스를 사용하여 생성한 ScoreVO 객체에 담고
		// = ScoreVO에 담고
		
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		
	}
	
	public String inputNum() {
		// TODO 학번 입력
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum==null) {
			return null;
		}
		
		String strNum =
				String.format("2021%03d", intNum);
		
		return strNum;
	}
	
	public String inputName(String strNum) {
		// TODO 이름 입력
		
		while(true) {
			System.out.println(strNum + " 의 학생 이름을 입력해주세요(QUIT : 입력종료)");
			System.out.print(">>> ");
			String strName = scan.nextLine();
			
			if(strName.equals("QUIT")) {
				return null;
			} else {
				return strName;
			}
		}
	}

	@Override
	public void printScroe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		//TODO 입력값 저장하기
		
		String strFileName = null;
		while(true) {
			
			System.out.println("성적 리스트 저장");
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			strFileName = scan.nextLine();
			if(strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				
				/*
				 * 파일에 저장할때 
				 * 각 데이터를 컴마(,)로 구분하여 입력하면
				 * 파일이름을 *.csv로 저장하면 
				 * 엑셀에서 파일을 읽을 수 있다.
				 * 
				 * csv : comma - separated - variables
				 * 
				 * 컴마로 값을 구분한 파일
				 */
				
				int nSize = scoreList.size();
				for(int i = 0 ; i < nSize ; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ", ");
					out.print(vo.getName() + ", ");
					out.print(vo.getKor() + ", ");
					out.print(vo.getEng() + ", ");
					out.println(vo.getMath());
					
				}
				
				out.flush();
				out.close();
				
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			
		return;
		}
	}

		
	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
