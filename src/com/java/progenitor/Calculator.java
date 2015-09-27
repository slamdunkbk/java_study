
package com.java.progenitor;

// 원래는 extends Object를 생략한다
class CalculatorClass extends Object {
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

    // Object 클래스의 toSting 메소드를 Overring 해서 바꿀수 있다
    public String toString() {
        return super.toString() + ", left:" + this.left + ", right:" + this.right;
    }
}

public class Calculator {
    public static void main(String[] args) {
        CalculatorClass c1 = new CalculatorClass();
        c1.setOprands(10, 5);
        // 아래의 결과값은 같다
        // toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면 암시적으로
        // toString이 된다
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
