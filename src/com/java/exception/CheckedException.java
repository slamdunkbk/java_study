package com.java.exception;

import java.io.*;

public class CheckedException{
	public static void main(String[] args){
		BufferedReader bReader = new BufferedReader(new FileReader("out_test.txt"));
		String input = bReader.readLine();
		System.out.println(input);
	}

}
