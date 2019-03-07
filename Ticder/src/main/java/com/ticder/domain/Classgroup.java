package com.ticder.domain;

import java.util.ArrayList;
import java.util.List;

import com.ticder.applicationDTO.ClassgroupDTO;
import com.ticder.utilities.InvalidParamException;

public class Classgroup {
	
	private Integer classGroupId;
	private List<Student> allStudents = new ArrayList<Student>();
	
	public Classgroup() {
		
	}
	
	public Classgroup(ClassgroupDTO classroomDto) throws InvalidParamException {
		if(classroomDto == null)
			throw new InvalidParamException();
		
		this.classGroupId = classroomDto.getClassId();
		//this.allStudents.addAll(allStudents);
		
	}
	
	
	public Integer getClassId() {
		return classGroupId;
	}
	public List<Student> getAllStudents() {
		return allStudents;
	}
	
	public void addStudent(Student student) {
		this.allStudents.add(student);
	}
	
	public void deleteStudent() {
		this.allStudents = new ArrayList<Student>();
	}

}
