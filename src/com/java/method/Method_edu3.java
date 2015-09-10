package com.java.method;

public class Method_edu3 {

	// 복수의 입력값 3, 5를 각각의 st, num 변수에 담는다
	public static void numbering(int st, int num){
		int i=st;
		while (i<=num){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		// 복수의 입력값 3, 5
		numbering(3, 5);
	}

}
