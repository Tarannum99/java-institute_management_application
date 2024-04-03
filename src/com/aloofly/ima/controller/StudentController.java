package com.aloofly.ima.controller;

import java.util.ArrayList;

import com.aloofly.ima.model.Student;
import com.aloofly.ima.service.IStudentService;
import com.aloofly.ima.serviceImpl.StudentServiceImpl;

public class StudentController {

	IStudentService studentService = new StudentServiceImpl();

	public Student createStudent() {
		System.out.println("\n ⪢⪢⪢⪢ Welcome to Create Student ⪢⪢⪢⪢ \n");
		return studentService.create();
	}

	public void displayStudent(Student currentStudent) {
		System.out.println("\n  ⪢⪢⪢⪢ WelCome To Display Student  ⪢⪢⪢⪢ \n");
		studentService.displayStudent(currentStudent);
	}

	public ArrayList<Student> createAllStudent() {
		System.out.println("\n ⪢⪢⪢⪢ Welcome to Create Student ⪢⪢⪢⪢ \n");
		return studentService.createAll();
	}

	public void displayAllStudent(ArrayList<Student> allStudent) {
		System.out.println("\n ⪢⪢⪢⪢ Welcome to Display Student ⪢⪢⪢⪢ \n");
		studentService.displayAllStudent(allStudent);
	}

}
