package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;

public class WordServiceImplV1A implements WordService {

	protected final int 영어 = 0;
	protected final int 한글 = 1;
	
	protected List<WordVO> wordList;
	protected Scanner scan;
	protected Random rnd;
	
	public WordServiceImplV1A() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		rnd = new Random();
		// word.txt 파일을 읽어서 wordList 데이터를 생성하는 method를 생성자에서
		// 호출하여 이 클래스(WordService...V1)를 생성하면 자동으로 실행되어 wordList
		// 데이터를 준비하도록 한다.
		this.loadWord();
	}
	
	@Override
	public void loadWord() {
		// TODO word.txt 파일을 읽어서 wordList 만들기
		String wordFile = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)break;
				
				String words[] = reader.split(":");
				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[영어]);
				wordVO.setKorea(words[한글]);
				wordList.add(wordVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 여는동안 문제 발생");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일에서 데이터 읽는중 문제 발생");
		}
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		
		int winCount = 0;
		int loseCount = 0;
		while(true) {
			WordVO vo = this.getWord();
			System.out.println(vo.toString());
			
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어 단어는?(Quit : 그만하기)");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.println(">> ");
			String strKor = scan.nextLine();
			
			if(strKor.equals("Quit")) {
				break;
			}
			
			if(strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("참 잘했어요!");
				winCount++;
			} else {
				System.out.println("좀더 열심히 공부합시다");
				loseCount++;
			}
			System.out.println("=".repeat(50));
			System.out.printf("지금까지 성공한 개수 : %d\n", winCount);
			System.out.printf("지금까지 실패한 개수 : %d\n", loseCount);
		}
		System.out.println("GAME OVER!");
	
		
	}
	
	protected WordVO getWord() {
		// TODO wordList 에 담긴 데이터중 임의의 데이터 1개를 추출하여 보여주기
		Random rnd = new Random();
		rnd.nextInt(100); // 0 ~99까지 중의 정수 1개 생성
		
		int nSize = wordList.size();
		
		int num = rnd.nextInt(nSize);
		
		WordVO wordVO = wordList.get(num);
		System.out.println(wordVO);
//		System.out.println(wordVO.toString());
		return wordVO;
	}
	

}
