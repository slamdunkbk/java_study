package com.java.progenitor;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj){
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
}
public class ObjectStudent{
	public static void main(String[] args){
		Student s1 = new Student("jaemin");
		Student s2 = new Student("jaemin");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
