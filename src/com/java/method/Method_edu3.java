package com.java.method;

public class Method_edu3 {

	public static void numbering(int st, int num){
		int i=st;
		while (i<=num){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(3, 5);
	}

}
