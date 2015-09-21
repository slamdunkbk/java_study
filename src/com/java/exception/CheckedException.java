package com.java.exception;

import java.io.*;

public class CheckedException{
	public static void main(String[] args){
		// bReader, input 변수는 try클래스 밖에 생성해 전역변수로 사용해야 한다
		// 변수의 초기값을 Null로 지정해야지만 변수를 사용할 때 초기화가 되지 않았다는 오류를 피할 수 있다
		BufferedReader bReader = null;
		String input = null;
		try {
			// FileReader라는 클래스는 FileNotFoundException예외처리를 강제하고 있다.
			bReader = new BufferedReader(new FileReader("out_test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			// BufferedReader 클래스의 readLine 메소드는 IOException예외처리를 강제하고 있따
			input = bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
