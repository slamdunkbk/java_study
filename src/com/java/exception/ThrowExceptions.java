package com.java.exception;

import java.io.*;

class B{
	// FileReader의 생성자와 BufferedReader.readLine가 던진 예외의 처리를 Throw하여
	// b.run()을 사용하는 다음사용자에게 예외처리를 넘긴다
	void run() throws FileNotFoundException, IOException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out_test.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C{
	// b.run의 예외 FileNotFoundException, IOException의 처리를
	// c.run의 사용자에게 예외처리를 넘긴다
	void run() throws FileNotFoundException, IOException{
		B b = new B();
		b.run();
	}
}

public class ThrowExceptions{
	public static void main(String[] args){
		C c = new C();
		// 엔드유저인 애플리케이션의 사용자가 out.txt 파일을 루트 디렉토리에 위치시켜야 하는 문제이기 때문에
		// 애플리케이션의 진입점인 메소드 main으로 책임을 넘기고 있다
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out_text.txt 파일이 필요합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
