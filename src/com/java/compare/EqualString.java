
package com.java.compare;

public class EqualString {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        // == : a 와 b가 같은 내용의 문자열이지만 서로 다른 객체를 참조 false
        // .equals : a 와 b가 같은 메모리 내의 값(유니코드)를 비교 true
    }
}
