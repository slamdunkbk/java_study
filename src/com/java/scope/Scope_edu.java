package com.java.scope;

public class Scope_edu {

	// a() 매소드 안의 변수 i는 a매소드에서만 유효한 변수이다 (scope)
	static void a() {
		int i = 0;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
