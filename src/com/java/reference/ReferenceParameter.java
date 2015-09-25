package com.java.reference;

public class ReferenceParameter{
	// int a = 1;
	// int b = a;
	// int b = 2;
	// 1
	static void _value(int b){
		b = 2;
	}
	public static void runValue(){
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	// A a = new A(1);
	// A b = a;
	// b = new A(2);
	// 1
	static void _reference1(A b){
		b = new A(2);
	}
	public static void runReference(){
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference, " + a.id);
	}
	// A a = new A(1);
	// A b  = a;
	// b.id = 2;
	// a.id와 b.id의 주소가 같은 주소이므로 메소드 id를 바꾸면 a.id도 바뀐다
	static void _reference2(A b){
		b.id = 2;
	}
	public static void runReference2(){
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}

	public static void main(String[] args){
		runValue();
		runReference();
		runReference2();
	}

}
