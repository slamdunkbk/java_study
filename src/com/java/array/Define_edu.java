package com.java.array;

public class Define_edu {

	public static void main(String[] args) {
		String[] classGroup = { "변수1", "변수2", "변수3", "변수4" };

		System.out.println(classGroup.length);

		// for(int i=0; i<classGroup.length;i++){
		// String clas=classGroup[i];
		// System.out.println(clas+" 불러옴");
		// }
		for (String each: classGroup) {
			System.out.println(each + " 불러옴");
		}

	}

}
