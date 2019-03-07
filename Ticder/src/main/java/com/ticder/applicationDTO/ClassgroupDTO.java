package com.ticder.applicationDTO;

import java.util.ArrayList;
import java.util.List;

import com.ticder.domain.Classgroup;
import com.ticder.domain.Student;
import com.ticder.utilities.InvalidParamException;

public class ClassgroupDTO {
	
	private int classGroupId;
	private List<StudentDTO> allStudents = new ArrayList<StudentDTO>();
	
	public ClassgroupDTO() {
		
	}
	
	public ClassgroupDTO(Classgroup classgroup) throws InvalidParamException {
		if(classgroup == null)
			throw new InvalidParamException();
		
		this.classGroupId = classgroup.getClassId();
		this.allStudents = convertToDTO(classgroup.getAllStudents());
	}
	
	private List<StudentDTO> convertToDTO(List<Student> allStudent) throws InvalidParamException {
		List<StudentDTO> results = new ArrayList<>();
		for (Student  s: allStudent) {
			results.add(new StudentDTO(s));
		}
		return results;
		
	}
	
	public Integer getClassId() {
		return classGroupId;
	}
	public List<StudentDTO> getAllStudents() {
		return allStudents;
	}
	
	

}
