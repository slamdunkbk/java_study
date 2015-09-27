
package com.java.constructor;

class Calculator {
    int left, right;

    // 클래스의 이름과 같은 매소드가 있을땐
    // 해당 매소드가 가장먼저 실행되게 만든다
    // 이것을 생성자(Constructor) 라고 한다
    public Calculator(int left, int right) {
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
        // Calculator은 인스턴스 생성자 이다
        Calculator c1 = new Calculator(10, 20);
        c1.sum();
        c1.avg();
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}
