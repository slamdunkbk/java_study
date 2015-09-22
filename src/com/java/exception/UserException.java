package com.java.exception;

//Exception을 상속하기 때문에 checked가 발생한다
class DivideException extends Exception{
	public int left;
	public int right;
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
	DivideException(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}

class CalculatorUser{
	int left, right;
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void divide() throws DivideException{
		if (this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다", this.left, this.right);
		}
		System.out.print(this.left / this.right);
	}
}

public class UserException{
	public static void main(String[] args){
		CalculatorUser c11 = new CalculatorUser();
		c11.setOprands(10, 0);
		try {
			c11.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}