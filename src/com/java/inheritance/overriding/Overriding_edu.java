
package com.java.inheritance.overriding;

class Ca {
    int left, right;

    int third = 0;

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

class overridings extends Ca {
    public overridings(int left, int right) {
        super(left, right);
    }

    public void Sub() {
        System.out.println(this.left - this.right);
    }

    // 부모클래스의 메소드를 자식클래스에서 다시 정의해 사용할수있다
    // 이것을 오버라이딩이라 한다
    public void sum() {
        System.out.println("실행결과는" + (this.left + this.right) + "입니다.");
    }
    // 부모클래스의 사용 방식과 달라서 Error
    // - 메소드의 이름
    // - 메소드 매개변수의 숫자와 데이터 타입, 순서
    // - 메소드의 리턴 타입
    // public int avg(){
    // return(this.left+this.right)/2;
    // }
}

public class Overriding_edu {
    public static void main(String[] args) {
        overridings c1 = new overridings(10, 20);
        c1.sum();
        c1.avg();
        c1.Sub();
    }
}
