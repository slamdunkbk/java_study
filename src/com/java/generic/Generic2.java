package com.java.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person1<T> {
	public T info;
	Person1(T info){
		this.info = info;
	}
}

public class Generic2{
	public static void main(String[] args){
		// p1의 info 메소드 데이터 타입은 EmployeeInfo이다
		Person1<EmployeeInfo> p1 = new Person1<EmployeeInfo>(new EmployeeInfo(11));
		EmployeeInfo ei1 = p1.info;
		System.out.println(ei1.rank);
		// p2의 info 메소드 데이터 타입은 StudentInfo이다
		Person1<StudentInfo> p2 = new Person1<StudentInfo>(new StudentInfo(22));
		StudentInfo si1 = p2.info;
		System.out.println(si1.grade);
	}
}
