package com.aloofly.ima.service;

import java.util.ArrayList;

import com.aloofly.ima.model.Faculty;

public interface IFacultyService extends IBaseService<Faculty> {
	void displayFaculty(Faculty faculty);
	void displayAllFaculty(ArrayList<Faculty> allFaculty);
}
