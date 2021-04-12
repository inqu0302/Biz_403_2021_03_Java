package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {
	
	List<Integer> kor;
	List<Integer> eng;
	List<Integer> math;
	
	InputServiceV2 inService;
	String [] subject;
	
	public ScoreServiceV5A() {
		kor = new ArrayList<Integer>();
		eng = new ArrayList<Integer>();
		math = new ArrayList<Integer>();
		
		inService = new InputServiceV2();
		subject = new String[]{"국어", "영어", "수학"};
				
	}
	
	public void inputScore() {
		
		for(int i = 0; i< 5 ; i++) {
			Integer[] scores = new Integer[subject.length];
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = inService.inputValue(subject[j], 0, 100);
			}
			// scores에는 한 학색의 국어,영어,수학 점수가 저장되어있다
			kor.add(scores[0]);
			eng.add(scores[1]);
			math.add(scores[2]);
		}
	}
	
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		for(int index = 0; index < kor.size() ; index++) {
			System.out.println(kor.get(index) + "\t");
			System.out.println(eng.get(index) + "\t");
			System.out.println(math.get(index) + "\n");
		}
		
		System.out.println("=".repeat(50));
		
	}
	
	public void inputScroe1() {
		
		for(int i = 0; i< 5 ; i++) {
			Integer score = inService.inputValue(subject[i], 0, 100);
			if(score == null) {
				return;
			} else if(i == 0) {
				kor.add(score);
			} else if(i == 1) {
				eng.add(score);
			} else if(i == 2 ) {
				math.add(score);
			}
		}
	}
	
	public void inputScore2() {

		for(int i = 0; i< 5 ; i++) {
			Integer score = inService.inputValue(subject[i], 0, 100);
			if(score == null) {
				return;
			} else if(subject[i].equals("국어")) {
				kor.add(score);
			} else if(subject[i].equals("영어")) {
				eng.add(score);
			} else if(subject[i].equals("수학")) {
				math.add(score);
			}
			
		}
	}
}
