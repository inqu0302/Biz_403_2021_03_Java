package com.callor.student;

import com.callor.stuedent.service.StudentService;
import com.callor.stuedent.service.impl.StudentsServiceImplV1A;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		// 기본값으로 설정된 파일을 사용하여 객체 생성 진행
		StudentService sService = new StudentsServiceImplV1A();
		
		// .../st.txt 파일을 사용하여 객체 생성 진행
		StudentService sService2 = new StudentsServiceImplV1A("src/com/callor/student/st.txt");
		
		sService.printStudent();
	}
}
