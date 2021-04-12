package com.callor.app.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/*
 * Random클래스를 사용하여 0 ~ 100 까지 범위의 난 수 2개를 생성후 사칙연산 수행
 * FileWriter, PrintWriter 클래스를 사용하여 app/data.txt 파일에 결과를 저장
 * 
 */
public class FileWriterService_01 {
	
	Random rnd;
	int num1;
	int num2;
	FileWriter fileWriter;
	PrintWriter printWriter;
	
	public FileWriterService_01() {
		rnd = new Random();
		num1 = 0;
		num2 = 0;
		
		fileWriter = null;
		printWriter = null;
	}
	
	public void MakeNum() {
		num1 = rnd.nextInt(100) + 1 ;
		num2 = rnd.nextInt(100) + 1 ;
		
		String fileName = "src/com/callor/app/data.txt";
		
		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileName);
			
			printWriter.println("=".repeat(50));
			printWriter.printf("%d + %d = %d\n",num1 , num2, num1 + num2);
			if(num1 > num2) {
				printWriter.printf("%d - %d = %d\n",num1 , num2, num1 - num2);
			} else {
				printWriter.printf("%d - %d = %d\n",num2 , num1, num2 - num1);
			}
			printWriter.printf("%d * %d = %d\n",num1 , num2, num1 * num2);
			if(num1 > num2) {
				printWriter.printf("%d / %d = %d\n",num1 , num2, num1 / num2);
			} else {
				printWriter.printf("%d / %d = %d\n",num2 , num1, num2 / num1);
			}
			printWriter.println("-".repeat(50));
			printWriter.flush();
			printWriter.close();
			System.out.println("저장완료");
			
		} catch (Exception e) {
			System.out.println("저장불가");
		}
	}
	
}
