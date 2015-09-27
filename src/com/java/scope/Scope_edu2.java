
package com.java.scope;

public class Scope_edu2 {
    // 전역변수 i
    static int i;

    static void a() {
        // 전역변수 i
        i = 0;
    }

    public static void main(String[] args) {
        // 전역변수 i
        for (i = 0; i < 5; i++) {
            a();
            // 전역변수 i를 출력하므로 i=0이 무한루프
            System.out.println(i);
        }
    }
}
