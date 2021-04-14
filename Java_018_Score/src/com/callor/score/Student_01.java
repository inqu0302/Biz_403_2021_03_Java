package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Student_01 {

	public static void main(String[] args) {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/studunt.txt";
		
		try {
			System.out.println("=".repeat(70));
			
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
			
			
			String [] scores = reader.split(":");
			
			System.out.printf("이름 : %s 주소 : %s\n",
					scores[1], scores[5]);
			}
			buffer.close();
			System.out.println("=".repeat(70));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
