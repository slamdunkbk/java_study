package com.java.io;

import java.util.Scanner;

public class Scanner_edu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// hasNextInt() 매소드 : 일단 정지하여 sc변수의 값이 Int값으로 들어온순간 실행
		// sc변수의 값이 Int값이 아닌 값이 들어온 순간 False 값을 리턴하여 반복문 종료
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();
	}
}
