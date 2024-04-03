package com.aloofly.ima.controller;

import java.util.ArrayList;

import com.aloofly.ima.model.Batch;
import com.aloofly.ima.model.Course;
import com.aloofly.ima.service.ICourseService;
import com.aloofly.ima.serviceImpl.CourseServiceImpl;

public class CourseController {

	ICourseService courseService = new CourseServiceImpl();

	public Course createCourse() {
		System.out.println("\n ●● Welcome To Create Course ●● \n");
		return courseService.create();

	}

	public void displayCourse(Course currentCourse) {
		System.out.println("\n ●●  Welcome To Display Course ●● \n ");
		courseService.displayCourse(currentCourse);
	}

	public ArrayList<Course> createAllCourse() {
		System.out.println("\n ●●  Welcome To Display Course ●●  \n ");
		return courseService.createAll();
	}

	public void displayAllCourse(ArrayList<Course> allCourse) {
		System.out.println("\n ●●  Welcome To Display Course ●●  \n");
		courseService.displayAllCourse(allCourse);
	}
}
