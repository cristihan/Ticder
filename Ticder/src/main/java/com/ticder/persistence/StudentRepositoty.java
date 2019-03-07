package com.ticder.persistence;

import java.util.ArrayList;
import java.util.List;

import com.ticder.domain.Student;
import com.ticder.utilities.InvalidParamException;
import com.ticder.utilities.NotFoundException;

public class StudentRepositoty {
	
	private HelperStudentRepository repository;
	
	public void saveStudent(Student student) throws InvalidParamException {
		if(student == null)
			throw new InvalidParamException();
		try {
			repository.save(student);
		} catch (Exception e) {
			throw new InvalidParamException();
		}
	}
	
	public List<Student> getAllStudent(){
		List<Student> result = new ArrayList<>();
		for (Student student : repository.findAll()) {
			result.add(student);
		}
		return result;
	}
	
	public void deleteStudentById(int studentId) {
		repository.deleteById(studentId);
	}
	
	public Student getStudentById(int studentId) throws NotFoundException {
		try {
			return repository.findById(studentId).get();
		} catch (Exception exception) {
			throw new NotFoundException();
		}
	}
	
	public Student getStudentByName(String name) throws InvalidParamException {
		Student student = repository.findByName(name);
			if(student == null)
				throw new InvalidParamException();
			return student;
		}
	

}
