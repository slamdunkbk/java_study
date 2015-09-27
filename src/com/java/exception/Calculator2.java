
package com.java.exception;

class CalculatorClass2 {
    int left, right;

    public void setOprands(int left, int right) {
        /*
         * 아래와 같이 IllegalArgumentException를 던져 예외처리를 할 수 있다 if(right ==0) {
         * throw new IllegalArgumentException( "두번째 인자는 0이 아니어야 한다"); }
         */
        this.left = left;
        this.right = right;
    }

    public void divide() {
        if (right == 0) {
            // right가 0이라면 ArithmeticException객제를 생성한다
            throw new ArithmeticException("0으로 나눌 수 없다");
        }
        try {
            System.out.println("계산결과는");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
        } catch (Exception e) {
            System.out.println("e.getMessage\n" + e.getMessage());
            System.out.println("\n e.toString()\n" + e.toString());
            System.out.println("\n e.printStackTrace()");
            e.printStackTrace();
        }
        System.out.println("실행은 계속 된다.");
    }
}

public class Calculator2 {
    public static void main(String[] args) {
        CalculatorClass2 c1 = new CalculatorClass2();
        c1.setOprands(10, 0);
        try {
            c1.divide();
            // c1.divide에서 발생한 Exception중
            // catch구문에 ArithmeticException과 같은 데이터
            // 타입을 찾아 실행한다
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
