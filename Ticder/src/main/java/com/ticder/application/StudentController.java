package com.ticder.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.ticder.applicationDTO.ClassgroupDTO;
import com.ticder.applicationDTO.StudentDTO;
import com.ticder.domain.Student;
import com.ticder.persistence.StudentRepositoty;
import com.ticder.utilities.InvalidParamException;

public class StudentController {
	
	private StudentRepositoty studentRepository;
	
	/*
	 * student : /afegirAlumne:
	 * Li dones el nom de l’alumne i l’afegeix en el sistema amb un ID.
	 */
	public StudentDTO createStudent(StudentDTO studentDto) throws InvalidParamException {
		Student student = new Student(studentDto);
		studentRepository.saveStudent(student);
		return new StudentDTO(student);
	}
	
	/*
	 * /esborrarAlumne:
	 * Li dones el id del alumne i l’esborra
	 */
	public void deleteStudent(int studentId) {
		studentRepository.deleteStudentById(studentId);
	}
	
	/*
	 * /aparellar:
	 */
	public List<ClassgroupDTO> getAllGroups(){
		List<ClassgroupDTO> allGroups = new ArrayList<>();
		
		return allGroups;
	}


}
