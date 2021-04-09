package com.collor.app;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriter_02 {

	public static void main(String[] args) {

		String fileName = "src/com/collor/app/9981.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.println("=".repeat(50));
			out.println("구구단을 외우자");
			out.println("-".repeat(50));
			for(int i = 2 ; i < 10 ; i++) {
				out.printf("%d X %d = %d\n", 7, i, 7 *i);
			}
			out.println("=".repeat(50));
			out.flush();
			out.close();
			System.out.println("완료!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("저장불가");
		}
	}
}
