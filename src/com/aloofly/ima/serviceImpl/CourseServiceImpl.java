package com.aloofly.ima.serviceImpl;

import java.util.ArrayList;
import java.util.Scanner;
import com.aloofly.ima.model.Course;
import com.aloofly.ima.model.Student;
import com.aloofly.ima.service.ICourseService;

public class CourseServiceImpl implements ICourseService {

	public Course create() {
		Scanner scanner = new Scanner(System.in);
		Course currentCourse = new Course();

		System.out.println("Enter Course Name");
		currentCourse.setName(scanner.next());
		System.out.println("Enter Course Id");
		currentCourse.setId(scanner.nextInt());
		System.out.println("Enter Course Duration");
		currentCourse.setDuration(scanner.next());

		return currentCourse;
	}

	public void displayCourse(Course course) {
		System.out.println("\t Course Name     -: " + course.getName());
		System.out.println("\t Course Id       -: " + course.getId());
		System.out.println("\t Course Duration -: " + course.getDuration());
		System.out.println("\n");
	}

	@Override
	public ArrayList<Course> createAll() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Course> allCourse = new ArrayList<Course>();
		System.out.println("⏺ How Many Courses Do You Want To Enter ❔");

		int numberOfCourse = scanner.nextInt();
		for (int m = 0; m < numberOfCourse; m++) {
			Course currentCourse = new Course();
			System.out.println("Enter Course Name");
			currentCourse.setName(scanner.next());
			System.out.println("Enter Course Id");
			currentCourse.setId(scanner.nextInt());
			System.out.println("Enter Course Duration");
			currentCourse.setDuration(scanner.next());

			allCourse.add(currentCourse);
		}
		return allCourse;
	}

	@Override
	public void displayAllCourse(ArrayList<Course> allCourse) {
		// TODO Auto-generated method stub
		for (int m = 0; m < allCourse.size(); m++) {
			Course course = allCourse.get(m);
			System.out.println("\t Course Name     -: " + course.getName());
			System.out.println("\t Course Id       -: " + course.getId());
			System.out.println("\t Course Duration -: " + course.getDuration());
			System.out.println("\n");
		}

	}

}
