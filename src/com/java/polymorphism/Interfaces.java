package com.java.polymorphism;

// 인터페이스 I2는 메소드 A의 정의를 강제화
interface I2{
	public String A();
}

// 인터페이스 I3는 메소드 B의 정의를 강제화
interface I3{
	public String B();
}

// 클래스 D는 인터페이스 I2,I3를 구현한다
class D implements I2, I3{
	public String A(){
		return "A";
	}
	public String B(){
		return "B";
	}
}

public class Interfaces{

	public static void main(String[] args){
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();

		obj.A();
		obj.B();

		objI2.A();
		// I2 인터페이스에는 메소드 B를 정의하지 않았기 때문에 I2의 속성을 가진 objI2객체는 B 메소드를 사용할 수 없다
		// objI2.B();

		// I3 인터페이스에는 메소드 A를 정의하지 않았기 때문에 I3의 속성을 가진 objI3객체는 A 메소드를 사용할 수 없다
		// objI3.A();
		objI3.B();

	}

}
