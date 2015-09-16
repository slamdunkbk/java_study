package com.java.accessmodifier;

class A {
	public String y() {
		return "public void y()";
	}

	private String z() {
		return "private void z()";
	}

	public String x() {
		return z();
	}
}

public class Access_edu {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		// 아래 코드는 오류가 발생한다
		// System.out.println(a.z());

		// 같은 A 클래스 에서는 private 매소드인 z를 호출 할 수 있다
		System.out.println(a.x());
	}

}
