package com.aloofly.ima.service;

import java.util.ArrayList;

import com.aloofly.ima.model.Student;

public interface IStudentService extends IBaseService<Student> {
	void displayStudent(Student student);
	void displayAllStudent(ArrayList<Student> allStudent);

}
