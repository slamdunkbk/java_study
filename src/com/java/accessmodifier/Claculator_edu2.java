package com.java.accessmodifier;

class Calculator {
	private int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	private int _sum() {
		return this.left + this.right;
	}

	// 같은 클래스 내의 _sum 매소드를 호출 할 수 있다
	public void sumDecoPlus() {
		System.out.println("++++" + _sum() + "++++");
	}

	public void sumDecoMinus() {
		System.out.println("----" + _sum() + "----");
	}

}

public class Claculator_edu2 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	}
}
