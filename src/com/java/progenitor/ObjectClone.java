package com.java.progenitor;
//해당 클래스가 복제가능한 클래스로 표기하기위한 implements Cloneable
class StudentClass implements Cloneable{
	String name;
	StudentClass(String name) {
		this.name = name;
	}
	// clone 메소드는 CloneNotSupportedException의 사용을 강제한다
	protected Object clone() throws CloneNotSupportedException{
		// super는 부모클래스의 필드나 메소드를 사용하란 뜻
		return super.clone();
	}
}
public class ObjectClone{

	public static void main(String[] args){
		StudentClass s1 = new StudentClass("jaemin");
		try {
			// Object클래스의 객체 s1.clone 을 s2에 넣기 위해선 StudentClass로 형변환 해야된다
			StudentClass s2 = (StudentClass) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
