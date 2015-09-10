package com.java.method;

public class Method_edu6 {

	// 매소드의 반환값이 String[] 배열 형태
	public static String[] numbering() {
		String[] members = { "배열1", "배열2", "배열3" };

		// members 라는 배열을 리턴
		return members;
	}

	public static void main(String[] args) {
		// 리턴된 numbering매소드의 출력값을 result라는 배열에 넣음
		String[] result = numbering();

		// foreach 문을 통해 result 배열의 내용을 전부 출력
		for (String e : result) {
			System.out.println(e);
		}
	}

}
