package com.aloofly.ima.serviceImpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.aloofly.ima.model.Faculty;
import com.aloofly.ima.service.IFacultyService;

public class FacultyServiceImpl implements IFacultyService {

	@Override
	public Faculty create() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Faculty currentFaculty = new Faculty();

		System.out.println("Enter Faculty Name");
		currentFaculty.setName(scanner.next());
		System.out.println("Enter Number of Faculty Member");
		currentFaculty.setNumberOfMembers(scanner.nextInt());
		System.out.println("Enter Contact Number");
		currentFaculty.setContactNumber(scanner.nextInt());

		return currentFaculty;
	}

	@Override
	public void displayFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		System.out.println("\t Faculty Name              -: " + faculty.getName());
		System.out.println("\t Number of Faculty Members -: " + faculty.getNumberOfMembers());
		System.out.println("\t Contact Number            -: " + faculty.getContactNumber());
		System.out.println("\n");

	}

	@Override
	public ArrayList<Faculty> createAll() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Faculty> allFaculty = new ArrayList<Faculty>();

		System.out.println("⏺ How many Faculties Do You Want To Enter ❔");

		int numberOfFaculty = scanner.nextInt();
		for (int k = 0; k < numberOfFaculty; k++) {
			Faculty currentFaculty = new Faculty();
			System.out.println("Enter Facult Name");
			currentFaculty.setName(scanner.next());
			System.out.println("Enter Number of Facult Member ");
			currentFaculty.setNumberOfMembers(scanner.nextInt());
			System.out.println("Enter Contact Number");
			currentFaculty.setContactNumber(scanner.nextInt());

			allFaculty.add(currentFaculty);
		}
		return allFaculty;
	}

	@Override
	public void displayAllFaculty(ArrayList<Faculty> allFaculty) {
		// TODO Auto-generated method stub

		for (int k = 0; k < allFaculty.size(); k++) {
			Faculty faculty = allFaculty.get(k);
			System.out.println("\t Faculty Name             -: " + faculty.getName());
			System.out.println("\t Number of Faculty Member -: " + faculty.getNumberOfMembers());
			System.out.println("\t Contact Number           -: " + faculty.getContactNumber());
		}
	}

}
