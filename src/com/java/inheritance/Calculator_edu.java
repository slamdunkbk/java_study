package com.java.inheritance;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
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

// 부모클래스 Calculator를 SubstractionableCalculator클래스가 상속받아 자식클래스가 됨
// 자식클래스는 기존의 객체를 그대로 유지하면서 기능을 추가할때 사용한다
class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class Calculator_edu {

	public static void main(String[] args) {
		// 인스턴스 c1을 SubstractionableCalculator클래스로 만들었으므로 Calculator클래스의 변수,매소드를
		// 사용할수있다.
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
