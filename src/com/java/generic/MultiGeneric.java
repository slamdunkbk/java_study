package com.java.generic;

class Employee{
	public int rank;
	Employee(int rank){
		this.rank = rank;
	}
}

class MPerson<T, S> {
	public T info;
	public S id;
	MPerson(T info, S id){
		this.info = info;
		this.id = id;
	}
	public <U> void PrinInfo(U info){
		System.out.println(info);
	}
}

public class MultiGeneric{
	// 제네릭의 데이터 타입에는 기본 데이터 타입인 int가 올 수 없으므로 래퍼클래스(wrapper)를 이용하여 int 타입을
	// 구현한다
	public static void main(String[] args){
		Employee ei = new Employee(1);
		// new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 한다
		Integer id = new Integer(11);
		MPerson p1 = new MPerson(ei, id);
		// Integer 클래스의 메소드 intValue를 사용하여 해당 값을 불러온다
		p1.PrinInfo(ei);
		System.out.println(p1.id);
	}
}
