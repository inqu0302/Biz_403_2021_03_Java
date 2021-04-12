package com.callor.app.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;

public class ScoreServiceV2 implements ScoreService {

	FileWriter fileWriter;
	PrintWriter out;
	Scanner scan;
	List<ScoreVO>scoreList;
	
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void selectMenu() {
		// TODO 메뉴 선택
		
		String strMenu = null;
		
		while(true) {
			
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT. 종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			strMenu = scan.nextLine();
			
			if(strMenu.equals("QUIT")) {
				return;
			} else if (strMenu.equals("1")) {
				this.inputScore();
			} else if (strMenu.equals("2")) {
				this.printScroe();
			} else if (strMenu.equals("3")) {
				this.saveScore();
			} else {
				System.out.println("메뉴는 QUIT 또는 정수값만 입력해주세요");
				continue;
			}
			
			break;
			
		}//end while
		
		System.out.println("업무종료");
		
	}// end selectMenu

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScroe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

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
