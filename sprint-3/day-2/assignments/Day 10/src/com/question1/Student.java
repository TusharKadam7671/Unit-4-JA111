package com.question1;

public class Student extends Person{
	
	private int studentId;
	private String courseEnrolled;
	private int courseFee;
	
	public Student(){
		
	}
	
	Student(String name, String gender, int studentId, String courseEnrolled, int courseFee) {
		super(name, gender);
		// TODO Auto-generated constructor stub
		this.studentId=studentId;
		this.courseEnrolled=courseEnrolled;
		this.courseFee=courseFee;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId= "+studentId+", "+"courseFee="+courseFee+
				", "+"courseEnrolled="+courseEnrolled+"]";
	}
	
	

}
