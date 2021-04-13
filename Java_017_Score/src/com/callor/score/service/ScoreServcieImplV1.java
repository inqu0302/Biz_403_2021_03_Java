package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.inqu0302.standard.MenuService;
import com.inqu0302.standard.impl.MenuServiceImplV1;

public class ScoreServcieImplV1 implements ScoreService{

	protected MenuService menu;
	protected List<String>menuList;
	protected List<ScoreVO>scoreList;
	
	public ScoreServcieImplV1() {
		
		scoreList = new ArrayList<ScoreVO>();
				
	}
	


	@Override
	public void selectMenu() {
		
		menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		
		menu = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menuList);
		
		while(true) {
			Integer intMenu = menu.selectMenu();
			
			if(intMenu == null) {
				System.out.println("업무종료");
				return;
			} else if(intMenu == 1) {

			} else if(intMenu == 2) {
				this.inputScore();
			} else if(intMenu == 3) {
				this.readScore();
			} else if (intMenu == 4) {
				this.saveScore();
			} else if (intMenu == 5) {
				this.printScore();
			}
			
		}
		
	}
	

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}
	
	

}
