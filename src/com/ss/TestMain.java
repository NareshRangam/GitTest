package com.ss;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("1", "student1", "Maths"));
		studentList.add(new Student("2", "student2", "Science"));
		studentList.add(new Student("3", "student3", "Maths"));
		studentList.add(new Student("4", "student4", "Maths"));
		studentList.add(new Student("5", "student5", "Maths"));
		
		Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
		
		

	}

}
