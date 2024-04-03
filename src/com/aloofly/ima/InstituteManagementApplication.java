package com.aloofly.ima;

import java.util.ArrayList;
import java.util.Scanner;

import com.aloofly.ima.controller.BatchController;
import com.aloofly.ima.controller.CourseController;
import com.aloofly.ima.controller.FacultyController;
import com.aloofly.ima.controller.StudentController;
import com.aloofly.ima.model.Batch;
import com.aloofly.ima.model.Course;
import com.aloofly.ima.model.Faculty;
import com.aloofly.ima.model.Student;

public class InstituteManagementApplication {

	static int choice = 0;

	StudentController studentController = new StudentController();
	CourseController courseController = new CourseController();
	FacultyController facultyController = new FacultyController();
	BatchController batchController = new BatchController();
  
	Student student = new Student();
	Course course = new Course();
	Faculty faculty = new Faculty();
	Batch batch = new Batch();

	ArrayList<Student> allStudent = new ArrayList<Student>();
	ArrayList<Course> allCourse = new ArrayList<Course>();
	ArrayList<Faculty> allFaculty = new ArrayList<Faculty>();
	ArrayList<Batch> allBatch = new ArrayList<Batch>();

	public void switchOperationByChoice() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("> Enter Your Choice =>");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			student = studentController.createStudent();
			break;
		case 2:
			course = courseController.createCourse();
			break;
		case 3:
			faculty = facultyController.createFaculty();
			break;
		case 4:
			batch = batchController.createBatch();
			break;
		case 5:
			allStudent = studentController.createAllStudent();
			break;
		case 6:
			allCourse = courseController.createAllCourse();
			break;
		case 7:
			allFaculty = facultyController.createAllFaculty();
			break;
		case 8:
			allBatch = batchController.createAllBatch();
			break;
		case 9:
			studentController.displayAllStudent(allStudent);
			break;
		case 10:
			courseController.displayAllCourse(allCourse);
			break;
		case 11:
			facultyController.displayAllFaculty(allFaculty);
			break;
		case 12:
			batchController.displayAllBatch(allBatch);
			break;
		case 13:
			studentController.displayStudent(student);
			break;
		case 14:
			courseController.displayCourse(course);
			break;
		case 15:
			facultyController.displayFaculty(faculty);
			break;
		case 16:
			batchController.displayBatch(batch);
			break;
		case 20:
			System.exit(0);
			break;
		default:
			break;

		}

	}

	public static void getAllMenu() {
		System.out.println("⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎ \n");
		System.out.println("***All Menu***\n");
		System.out.println("⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎⇎ \n");
		System.out.println("1.  Create Student");
		System.out.println("2.  Create Course");
		System.out.println("3.  Create Faculty");
		System.out.println("4.  Create Batch");

		System.out.println("5.  Create Multiple Student");
		System.out.println("6.  Create Multipple Course");
		System.out.println("7.  Create Multiple Faculty");
		System.out.println("8.  Create Multiple Batch");

		System.out.println("9.  Display Multiple Student");
		System.out.println("10. Display Multiple Course");
		System.out.println("11. Display Multiple Faculty");
		System.out.println("12. Display Multiple Batch");

		System.out.println("13. Display Student");
		System.out.println("14. Display Course ");
		System.out.println("15. Display Faculty");
		System.out.println("16. Display Batch ");
		System.out.println("17. Exit \n");
	}

	public static void main(String[] args) {

		InstituteManagementApplication application = new InstituteManagementApplication();
		System.out.println("--------------------------------------------");
		System.out.println("***WelCome To Institute Management System***");
		System.out.println("--------------------------------------------");
		getAllMenu();

		do {
			application.switchOperationByChoice();
			getAllMenu();
		} while (choice > 0 && choice < 10);

	}

}
