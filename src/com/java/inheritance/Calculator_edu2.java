package com.java.inheritance;

class MultiplicationableCalculator extends Calculator{
	public void multiplication(){
		System.out.println(this.left * this.right);
	}
}

class divisionableCalculator extends MultiplicationableCalculator{
	public void divisionableCalculator(){
		System.out.println(this.left/this.right);
	}
}

public class Calculator_edu2 {

	public static void main(String[] args) {
		divisionableCalculator c1 = new divisionableCalculator();
		c1.setOprands(40, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.divisionableCalculator();
	}

}
