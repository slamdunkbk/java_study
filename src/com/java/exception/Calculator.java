
package com.java.exception;

class CalculatorClass {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        // 계산결과는 오류 발생 : / by zero
        try { // try : 예외의 발생이 예상되는 로직
            System.out.println("계산결과는");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
            // catch : 예외가 발생했을 때 실행되는 로직
            // Exception e : 예외클래스 인스턴스
            // e.getMessage
            // / by zero
            // e.toString()
            // java.lang.ArithmeticException: / by zero
            // e.printStackTrace()
            // java.lang.ArithmeticException: / by zero
            // at com.java.exception.CalculatorClass.divide(Calculator.java:14)
            // at com.java.exception.Calculator.main(Calculator.java:39)
        } catch (Exception e) {
            System.out.println("e.getMessage\n" + e.getMessage());
            System.out.println("\n e.toString()\n" + e.toString());
            System.out.println("\n e.printStackTrace()");
            e.printStackTrace();
        }
        // catch가 끝나고 프로그램이 종료된게 아니라 그다음 메소드가 동작한다
        System.out.println("실행은 계속 된다.");
    }
}

public class Calculator {
    public static void main(String[] args) {
        CalculatorClass c1 = new CalculatorClass();
        c1.setOprands(10, 0);
        // 10을 0으로 나누므로 Exception 발생!
        c1.divide();
    }
}
