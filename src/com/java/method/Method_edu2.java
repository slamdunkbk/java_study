package com.java.method;

public class Method_edu2 {

	// main 매소드에서 numbering변수의 입력되는 값 5를 numbering 매소드의 변수 i에 담는다
	public static void numbering(int i){
		while (i<10){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		// 입력값 5
		numbering(5);
	}

}
