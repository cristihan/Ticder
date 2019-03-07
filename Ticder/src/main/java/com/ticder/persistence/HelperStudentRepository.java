package com.ticder.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ticder.domain.Student;






// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

interface HelperStudentRepository extends CrudRepository<Student, Integer> {
	
	public Student findByName(String name);

}
