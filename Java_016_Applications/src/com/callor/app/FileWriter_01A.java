package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01A {

	public static void main(String[] args) {
		
		/*
		 * Eclipse 를 사용하여 프로젝트를 만들었을때 Project의 소스코드가 저장되는 곳은 
		 * Project/src 폴더 이후에 패키지 이름으로 만들어진다.
		 * 새로운 파일을 만들기 위해서 src/package-name 폴더를
		 * 지정하는데 타이핑을 직접하다보면 오타가 발생할수 있기때문에
		 * Copy Qulified 를 사용하여 임의의 파일 이름을 가져오고
		 * 필요한 파일로 이름을 변경하여 사용한다.
		 */
		String fileName = "src/com/callor/app/data_01.txt";
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		
		// 2개의 난수로 사칙연산을 수행
		// 뺄셈과 나눗셈은 반드시 큰수 - 작은수, 큰수 작은수
		
		// file과 관련된 클래스를 사용할 때는 객채선언과 생성문을 분리하여 작성
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int div = num1 / num2;
		

		
		// FileWriter, PrintWrtier를 객체로 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		// 객체 생성
		// FileWriter 클래스를 객체로 생성할때 만들(작성할, 새로생성할) 파일이름(경로포함)을
		// 	생성자 매개변수로 전달해 주어야 한다.
		try {
			/*
			 * FilewWriter 클래스의 객체만으로도 파일에 기록할 수 있지만
			 * 상당히 복잡하고, 불편한 코드를 만들어야 한다.
			 * PrintWriter 클래스의 객체를 FireWriter 클래스의 객체와 연결하여
			 * System.out 의 print관련 method 와 똑같은 방법으로 파엘에 Text들을 저장
			 * 
			 * Os < - > FileWriter < - > PrintWriter 가 서로 연결되어 데이터를 파일에 기록한다.
			 */
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileName);
			
			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			
			out.flush();
			out.close();
			
			// PrintWriter 를 닫으면 FileWriter 도 같이 닫히기 때문에 일부러 close를 하지 않아도 무방하다
			fileWriter.close();
			
			System.out.println("작업완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일을 생성할 수 없음");
		}
		
	}
}
