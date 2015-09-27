
package com.java.exception;

class A {
    private int[] arr = new int[3];

    A() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
            // 0을 나눌때 나타나는 오류
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            // 배열 범위 밖을 지정하는 오류
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            // Exception은 모든 오류를 다 포함하므로 제일 밑에 있어야 한다.
        } catch (Exception e) {
            System.out.println(e.toString());
            // 예외 여부와 관계없이 실행되는 로직
        } finally {
            System.out.println("Finally");
        }
    }
}

public class Exceptions {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);
        a.z(1, 0);
        a.z(2, 1);
    }
}
