package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSet{
	public static void main(String[] args){
		// 중복 허용 데이터관리 List
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		System.out.println("ArrayList");
		Iterator ai = al.iterator();
		while (ai.hasNext()) {
			System.out.println(ai.next());
		}
		// 중복이 허용되지 않는 데이터 관리 Set
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator();
		System.out.println("\nhashset");
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
