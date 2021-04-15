package com.callor.stuedent.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.stuedent.service.StudentService;
import com.callors.student.model.StudentVO;

/*
 * Student.txt파일을 읽어 학생 정보를 추출
 * List<StudentVO> studentList에 추가
 * loadStudent()를 호출 자동으로 학생정보 생성
 */
public class StudentsServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	/*
	 * new StudentServiceImplV1() 생성자를 호출하여
	 * 객체를 생성하려고 하면 고정된 파일이름
	 * ("src/com/callor/student/studunt.txt")을
	 * 사용하여 파일을 읽을 수 있도록 할 예정
	 * 
	 * 생성자에서는 new StudentServiceImplsV1("파일명")의 
	 * 생성자 method를 다시 호출하는 구조가 된다.
	 * 
	 */
	public StudentsServiceImplV1A() {
		// 여기에서 다음의 생성자 메서드를 또한번 호출
		// new StudentsServiceImplV1A("src/com/callor/student/studunt.txt")
		
		this("src/com/callor/student/studunt.txt");
	}
	
	public StudentsServiceImplV1A(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		// 객체 생성과 동시에 메서드 실행
		this.loadStudent();
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


		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				// 파일로 부터 읽은 값이 null
				// 	EOF ( End Of File) 에 다다랐다.
				if(reader == null) break;
				
				String [] students = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setNum(students[학번]);
				vo.setName(students[이름]);
				vo.setGrade(students[학년]);
				vo.setDept(students[학과]);
				vo.setAddress(students[주소]);
				
				// Debuging code
//				System.out.println(vo.toString());
				studentList.add(vo);
				
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(this.studentFile + " 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는동안 문제가 발생했습니다.");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생조회하여 학생정보 return
		
		// 1번 코드
		StudentVO studentVO = null;
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++) {
			// StudentVO vo = null;
			// vo = studentList.get(i);
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
//		return null;
		
		// 2번코드
		// 새로운 for, forEach
		for(StudentVO vo : studentList) {
			if(vo.getNum().equals(num)) return vo;
		}
		return null;
	}

	
	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학년\t학과\t\t주소");
		
		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는
		 * 배열, length 속성을 직접 반복은의 조건으로 설정한다.
		 * 		i < 배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다.
		 * List에 담긴 개수를 알려주는 size() method 는 호출될때 마다
		 * List에 담긴 데이터 개수를 다시 계산하는 코드가 실행된다.
		 * 
		 *  for() 반복문 내에서 i < list.size() 코드를 사용하게 되면
		 *  for() 반복문이 반복되는 동안 계속해서 개수를 헤아리게 된다.
		 *  데이터의 개수가 몇개 안될때는 큰 문제가 없지만 데이터 개수가 
		 *  많아지면 그만큼 성능이 떨어지게 된다.
		 *  
		 *  List 전체를 for() 반복문을 사용하여 순회할때는 먼저 size() 값을
		 *  int 형 변수에 담아놓고 시작하자	
		 */
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			StudentVO vo = studentList.get(i);
			
			System.out.printf("%s\t",vo.getNum());
			System.out.printf("%s\t",vo.getName());
			System.out.printf("%s\t",vo.getGrade());
			System.out.printf("%s\t",vo.getDept());
			System.out.printf("%s\n",vo.getAddress());
			
		}
		System.out.println("=".repeat(80));
		
	}

}
