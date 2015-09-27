
package com.java.inheritance.overloading;

public class Overloading_edu {
    // 메소드 A의 매개변수의 따라 여러가지의 오버로딩이 가능하다
    void A() {
        System.out.println("void A()");
    }

    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }

    void A(String arg1) {
        System.out.println("void A(String arg1)");
    }

    // int A(){System.out,println("void A()";}
    public static void main(String[] args) {
        Overloading_edu od = new Overloading_edu();
        od.A();
        od.A(1);
        od.A("Coding everbody");
    }
}
