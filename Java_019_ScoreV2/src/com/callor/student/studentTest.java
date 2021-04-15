package com.callor.student;

import com.callor.stuedent.service.impl.StudentsServiceImplV1;

public class studentTest {
	
	public static void main(String[] args) {
		
		StudentsServiceImplV1 sService = new StudentsServiceImplV1();
		
		sService.loadStudent();
		sService.printStudent();
	}
}
