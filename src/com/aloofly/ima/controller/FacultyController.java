package com.aloofly.ima.controller;

import java.util.ArrayList;

import com.aloofly.ima.model.Faculty;
import com.aloofly.ima.service.IFacultyService;
import com.aloofly.ima.serviceImpl.FacultyServiceImpl;

public class FacultyController {
	IFacultyService facultyService = new FacultyServiceImpl();

	public Faculty createFaculty() {
		System.out.println("\n ⋙⋙⋙⋙ Welcome To Create Faculty ⋘⋘⋘⋘\n");
		return facultyService.create();
	}

	public void displayFaculty(Faculty currentFaculty) {
		System.out.println("\n  ⋙⋙⋙⋙ WelCome To Display Faculty ⋘⋘⋘⋘ \n");
		facultyService.displayFaculty(currentFaculty);
	}

	public ArrayList<Faculty> createAllFaculty() {
		System.out.println("\n ⋙⋙⋙⋙ Welcome To Create Faculty ⋘⋘⋘⋘\n");
		return facultyService.createAll();
	}

	public void displayAllFaculty(ArrayList<Faculty> allFaculty) {
		System.out.println("\n ⋙⋙⋙⋙ Welcome To Create Faculty ⋘⋘⋘⋘\n");
		facultyService.displayAllFaculty(allFaculty);
	}

}
