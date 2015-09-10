package com.java.method;

public class Method_edu4 {

	public static String numbering(int init, int limit){
		int i=init;
		String output="";
		
		while (i<=limit){
			output+=i;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(3, 5);
		System.out.println(result);
	}

}
