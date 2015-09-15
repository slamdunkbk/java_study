package com.java.inheritance.overloading;

public class Overloading_edu2 extends Overloading_edu{

	// 메소드 A의 매개변수의 따라 여러가지의 오버로딩이 가능하다
	void A() {
		System.out.println("void A()");

	}

	void A(String arg1, String arg2) {
		System.out.println("void A(String arg1, String arg2)");
	}

	
	

	public static void main(String[] args) {
		Overloading_edu2 od = new Overloading_edu2();
		od.A();
		od.A(1);
		od.A("Coding everbody");
		od.A("Coding everbody", "hihihi");

	}

}
