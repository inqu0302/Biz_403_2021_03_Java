package com.callor.stuedent.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.stuedent.service.StudentService;
import com.callors.student.model.StudentVO;

/*
 * Student.txt파일을 읽어 학생 정보를 추출
 * List<StudentVO> studentList에 추가
 * loadStudent()를 호출 자동으로 학생정보 생성
 */
public class StudentsServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	
	public StudentsServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}
	
	
	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}
	/*
	 * student.txt 파일에서 학생정보를 읽어 
	 * studentList 에 데이터 준비하기 
	 */
	@Override
	public void loadStudent() {
		// TODO 학생정보를 읽어드리는 메서드

		String fileName = "src/com/callor/student/studunt.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				String [] students = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setNum(students[0]);
				vo.setName(students[1]);
				vo.setGrade(students[2]);
				vo.setDept(students[4]);
				vo.setAddress(students[5]);
				
				studentList.add(vo);
				
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일의 경로를 찾을수 없습니다.");
			
		} catch (IOException e) {
			System.out.println("파일을 읽는동안 문제가 발생했습니다.");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번을 입력받고 학생을찾기
		// 정보가있으면 vo 정보를 return 
		// 없으면 null 을 리턴
		
		int nsize = studentList.size();
		
		int index = 0;
		StudentVO vo = studentList.get(index);
		for (index = 0 ; index < nsize ; index++) {
			if(num.equals(vo.getNum())) return vo;
//			break;
		} 
//		
//		if (index >= nsize) {
//			return null;
//		} else {
//			return vo;
//		}
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("학번\t이름\t학년\t학과\t\t주소");
		for(int i = 0 ; i < studentList.size() ; i++) {
			
			StudentVO vo = studentList.get(i);
			
			System.out.printf("%s\t",vo.getNum());
			System.out.printf("%s\t",vo.getName());
			System.out.printf("%s\t",vo.getGrade());
			System.out.printf("%s\t\t",vo.getDept());
			System.out.printf("%s\n",vo.getAddress());
			
		}
		System.out.print(">> ");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		StudentVO Num= this.getStudent(num);
		System.out.println(Num.toString());
		
	}

}
