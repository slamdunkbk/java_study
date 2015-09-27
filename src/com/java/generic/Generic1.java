
package com.java.generic;

//제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
class Person<T> {
    // 클래스 메소드 info의 데이터 타입은 인스턴트를 생성할때 결정된다!!
    public T info;
}

public class Generic1 {
    public static void main(String[] args) {
        // 인스턴스 p1을 생성할때 데이터 타입을 String으로 지정
        Person<String> p1 = new Person<String>();
        // 인스턴스 p2를 생성할때 데이터 타입을 StringBuilder로 지정
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
}
