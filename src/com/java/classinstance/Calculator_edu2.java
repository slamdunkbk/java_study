package com.java.classinstance;

class Calculator2 {
	// PI,base 변수는 클래스의 맴버 변수이다
	static double PI = 3.14;
	// 만약 static 대신 final을 사용한다면 값을 변경 할 수 없음
	static int base = 0;

	// left, right 변수는 인스턴스의 맴버 변수이다
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		System.out.println((this.left + this.right + base) / 2);
	}
}

public class Calculator_edu2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum();

		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum();

		// 클래스 변수 base의 값을 바꿈
		Calculator2.base = 10;
		System.out.println(Calculator2.base);
		c1.sum();
		c2.sum();

	}

}
