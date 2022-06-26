package com.ss;

public class Student {
	
	private String studentId;
	private String studentName;
	private String subject;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Student(String studentId, String studentName, String subject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.subject = subject;
	}
	
	
	

}
