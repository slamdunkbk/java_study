
package com.java.inheritance;

class Ca {
    int left, right;

    public Ca() {
    }

    public Ca(int left, int right) {
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

class Substract extends Ca {
    public Substract(int left, int right) {
        // this.left = left;
        // this.right = right;
        // 상위클래스의 생성자를 가져올수있다(코드 중복 제거)
        super(left, right);
    }

    public void Sub() {
        System.out.println(this.left - this.right);
    }
}

public class Calculator_edu3 {
    public static void main(String[] args) {
        Substract c1 = new Substract(10, 20);
        c1.sum();
        c1.avg();
        c1.Sub();
    }
}
