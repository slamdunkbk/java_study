
package com.java.classinstance;

class Calculator {
    // PI 변수는 클래스의 맴버 변수이다
    static double PI = 3.14;

    // left, right 변수는 인스턴스의 맴버 변수이다
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class Calculator_edu {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        System.out.println(Calculator.PI);
    }
}
