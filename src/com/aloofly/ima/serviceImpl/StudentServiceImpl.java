package com.aloofly.ima.serviceImpl;

import java.util.ArrayList;
import java.util.Scanner;
import com.aloofly.ima.model.Student;
import com.aloofly.ima.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	@Override
	public Student create() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student currentStudent = new Student();

		System.out.println("Enter Student Name");
		currentStudent.setName(scanner.next());
		System.out.println("Enter Student Id");
		currentStudent.setId(scanner.nextInt());
		System.out.println("Enter Student Contact Number");
		currentStudent.setContactNumber(scanner.nextInt());
		System.out.println("Enter Student City");
		currentStudent.setCity(scanner.next());

		return currentStudent;
	}

	public void displayStudent(Student student) {
		System.out.println("\t Student Name           -: " + student.getName());
		System.out.println("\t Student Id             -: " + student.getId());
		System.out.println("\t Student Contact Number -: " + student.getContactNumber());
		System.out.println("\t Student City           -: " + student.getCity());
		System.out.println("\n");
	}

	@Override
	public ArrayList<Student> createAll() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> allStudent = new ArrayList<Student>();
		System.out.println("⏺ How Many Student Do You Want To Enter ❔");

		int numberOfStudent = scanner.nextInt();
		for (int i = 0; i < numberOfStudent; i++) {
			Student currentStudent = new Student();
			System.out.println("Enter Student Name");
			currentStudent.setName(scanner.next());
			System.out.println("Enter Student Id");
			currentStudent.setId(scanner.nextInt());
			System.out.println("Enter Student Contact Number");
			currentStudent.setContactNumber(scanner.nextInt());
			System.out.println("Enter Student City");
			currentStudent.setCity(scanner.next());

			allStudent.add(currentStudent);
		}
		return allStudent;
	}

	public void displayAllStudent(ArrayList<Student> allStudent) {

		for (int i = 0; i < allStudent.size(); i++) {
			Student student = allStudent.get(i);
			System.out.println("\t Student Name           -: " + student.getName());
			System.out.println("\t Student Id             -: " + student.getId());
			System.out.println("\t Student Contact Number -: " + student.getContactNumber());
			System.out.println("\t Student City           -: " + student.getCity());
			System.out.println("\n");
		}
	}

}
