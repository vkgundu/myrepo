package com.vinay;

import org.modelmapper.ModelMapper;

import com.vinay.model.Student;
import com.vinay.model.Student1;

public class HelloWorld {

	public static void main(String[] args) {
		ModelMapper map = new ModelMapper();
		Student st = new Student();
		st.setStudentId("vina");
		Student1 st1 = map.map(st, Student1.class);
		System.out.println(st.getStudentName());
		System.out.println(st1.getStudentId());
		System.out.println("My Sample Code");
		//st.setStudentId("");
		System.gc();
	}

}
