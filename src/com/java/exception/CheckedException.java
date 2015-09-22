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
			e.printStackTrace();
		}
		try {
			// BufferedReader 클래스의 readLine 메소드는 IOException예외처리를 강제하고 있다
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
/*
checked 예외
- RuntimeException을 제외한 Exception의 하위 클래스
- 반드시 예외 처리를 해야 된다.
- API 쪽에서 예외를 던졌을 때 API 사용자 쪽에서 예외 상황을 복구 할 수 있다면 checked 예외를 사용한다.

unchecked 예외
- RuntimeException의 하위 클래스
- 예외 처리를 해도 되고 안 해도 된다.
- 사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험 할 때 unchecked를 사용한다.
*/
