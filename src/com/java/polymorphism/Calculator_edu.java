
package com.java.polymorphism;

abstract class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();

    public abstract void avg();

    public void run() {
        sum();
        avg();
    }
}

class CalculatorPlus extends Calculator {
    public void sum() {
        System.out.println("+++" + _sum());
    }

    public void avg() {
        System.out.println("+++" + (this.left + this.right) / 2);
    }
}

class CalculatorMinus extends Calculator {
    public void sum() {
        System.out.println("---" + _sum());
    }

    public void avg() {
        System.out.println("---" + (this.left + this.right) / 2);
    }
}

public class Calculator_edu {
    // execute 메소드는 CalculatorDecoPlus와 CalculatorDecoMinus 클래스의 메소드 run을
    // 호출하고있다.
    // 만약 인스턴스 c1과 c2가 Calculator가 아니라 Plus와 Minus가 붙어있었다면 코드를 2번 작성해야 됫다
    public static void execute(Calculator cal) {
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        // Calculator를 상속받은 클래스들을 인스턴트화 할 때 Calculator를 데이터 타입으로 하고있다.
        // c1과 c2 모두 사용 할 때 두개의 클래스 모두 Calculator 인 것처럼 사용 할 수 있다.
        Calculator c1 = new CalculatorPlus();
        c1.setOprands(10, 20);
        Calculator c2 = new CalculatorMinus();
        c2.setOprands(10, 20);
        execute(c1);
        execute(c2);
    }
}
