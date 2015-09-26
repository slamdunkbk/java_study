package com.java.collection;

import java.util.ArrayList;

public class ArrayList_Study{
	public static void main(String[] args){
		// 배열은 한번 정해진 크기를 변경할 수 없다.
		String[] arrayObj = new String[2];
		arrayObj[0] = "zero";
		arrayObj[1] = "one";
		// arrayObj[2] = "two"; // 배열 범위를 벗어났다
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		System.out.println("Array\n");
		// ArrayList를 사용하여 배열의 단점을 없앤다
		// ArrayList의 데이터 타입은 Object이므로 제네릭을 사용하여 String으로 변환하여 사용한다.
		ArrayList<String> al = new ArrayList<String>();
		al.add("zero");
		al.add("one");
		al.add("two");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.get(0) + " " + al.get(1));
	}
}
