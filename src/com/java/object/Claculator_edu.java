
package com.java.object;

public class Claculator_edu {
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }

    public static void main(String[] args) {
        int left, right;
        // 변수값 선언 및 sum, avg 매소드 실행하여 값 출력
        left = 10;
        right = 20;
        sum(left, right);
        avg(left, right);
        // 변수값 다시 선언 및 매소드 값 출력
        left = 20;
        right = 40;
        sum(left, right);
        avg(left, right);
    }
}
