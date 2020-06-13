package com.tavant.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.springdemo.entity.Student;;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudent;

	@PostConstruct
	public void loadData() {

		theStudent = new ArrayList<Student>();
		theStudent.add(new Student("dharmendra", "Kumar"));
		theStudent.add(new Student("Vikram", "Kumar"));
		theStudent.add(new Student("Kalin", "Bhaiya"));

	}

	@GetMapping("/student")
	public List<Student> getStudents() {

		return theStudent;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if ((studentId >= theStudent.size()) || studentId < 0) {
			throw new StudentNotFoundException("Student id not found @ " + studentId);
		}
		return theStudent.get(studentId);
	}

}
