package com.java.array;

public class Define_edu{

	public static void main(String[] args){
		// 문자열 배열 classGroup 선언
		String[] classGroup = {"변수1", "변수2", "변수3", "변수4"};

		// classGroup 배열의 값들의 갯수 확인
		System.out.println(classGroup.length);

		// for(int i=0; i<classGroup.length;i++){
		// String clas=classGroup[i];
		// System.out.println(clas+" 불러옴");
		// }
		// foreach 문으로 classGroup 배열을 순차적으로 반복하여 처리
		for (String each : classGroup) {
			System.out.println(each + " 불러옴");
		}

	}

}
