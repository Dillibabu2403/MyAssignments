package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Babu");
	}public void studentDept() {
		System.out.println("Student dept is 12th std");
	}
	public void studentId() {
		System.out.println("Student id is 123456");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
