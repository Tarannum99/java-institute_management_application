package com.aloofly.ima.service;

import java.util.ArrayList;

import com.aloofly.ima.model.Course;

public interface ICourseService extends IBaseService<Course> {
	void displayCourse(Course course);
	void displayAllCourse(ArrayList<Course> allCourse);

}
