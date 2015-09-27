
package com.java.finals;

class Calculatorclass {
    // static은 클래스의 소유임을 나타낸다
    // final 필드를 정의해주면 상속,변경을 금지한다
    static final double PI = 3.14;

    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // Calculator.PI=6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculatorclass c1 = new Calculatorclass();
        c1.setOprands(10, 20);
        System.out.println(c1.PI);
        // Calculator.PI=6;
    }
}
