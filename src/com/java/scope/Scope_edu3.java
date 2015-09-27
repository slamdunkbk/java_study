
package com.java.scope;

public class Scope_edu3 {
    // 전역변수 i
    static int i;

    static void a() {
        // 전역변수 i
        // i = 0;
        // 지역변수 i
        int i = 0;
    }

    public static void main(String[] args) {
        // 전역변수 i
        // for (i = 0; i < 5; i++) {
        // 지역변수 i
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}
