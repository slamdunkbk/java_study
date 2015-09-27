
package com.java.abstractclass;

abstract class CalculatorClass {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    // sum(), avg() 메소드를 추상화 하여 상속받는 클레스에서 정의하도록 처리
    public abstract void sum();

    public abstract void avg();

    int _sum() {
        return this.left + this.right;
    }

    // run() 메소드를 실행하면 추상화시킨 sum(),avg() 메소드가 실행되도록 처리
    public void run() {
        sum();
        avg();
    }
}

class Calculatorplus extends CalculatorClass {
    // 추상 클래스를 상속 받았으므로 sum(), avg()메소드를 반드시 정의하여야 한다
    // 자식클래스에서 추상메소드를 정의하도록 하여 클래스별 메소드의 기능을 달리 할 수 있다
    public void sum() {
        System.out.println("++++" + _sum());
    }

    public void avg() {
        System.out.println("++++" + (this.left + this.right) / 2);
    }
}

class Calculatorminus extends CalculatorClass {
    public void sum() {
        // this.left + this.right가 2개의 자식클래스에서 중복되므로 부모클레스로 올려서 메소드화 시킨다
        System.out.println("----" + _sum());
    }

    public void avg() {
        System.out.println("----" + (this.left + this.right) / 2);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculatorplus c1 = new Calculatorplus();
        c1.setOprands(10, 20);
        c1.run();
        Calculatorminus c2 = new Calculatorminus();
        c2.setOprands(20, 40);
        c2.run();
    }
}
