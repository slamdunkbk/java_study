package com.java.object;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		// this는 클래스를 통해 만들어진 변수를 인스턴스의 변수로 사용하기위해 정의

		// left, right는 매개변수이고 이 변수는 setOprands 밖에서 사용 가능하지 않지만
		// 반면, this.left this.right는 4행에서 선언한 변수에 값을 설정하는 것이므로 인스턴스 내의 모든 메소드에서 접근 가능해진다
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Claculator_edu2 {

	public static void main(String[] args) {

		// 1. Calculator 객체를 new(새로생성)하여 Calculator데이터 타입의 인스턴스를 변수c1에 담는다.
		Calculator c1 = new Calculator();
		// 2. c1안의 변수를 setOprands라는 이름의 매소드를 사용
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

		// 다시 한번 Calculator 인스턴스 생성
		Calculator c2 = new Calculator();
		c2.setOprands(20, 30);
		c2.sum();
		c2.avg();
	}
}
