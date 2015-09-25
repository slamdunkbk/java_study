package com.java.progenitor;

class Student{
	String name;
	Student(String name) {
		this.name = name;
	}

	public boolean equals(Object obj){
		// (Student)obj 는 메소드 equals로 전달된 obj의 데이터 타입이 Object이기 때문에 이를 Student
		// 타입으로 형 변환하는 코드
		Student _obj = (Student) obj;
		return name == _obj.name;
	}
}
public class ObjectEquals{

	public static void main(String[] args){
		Student s1 = new Student("jaemin");
		Student s2 = new Student("jaemin");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
