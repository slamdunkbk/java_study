
package com.java.constant;

public class TypeConversion {
    public static void main(String[] args) {
        double a = 3.0f;
        System.out.println(a);
        float b = (float)100.0;
        int c = (int)100.0f;
        int d = (int)100.5f;
        // 100.5 -> 100 소숫점자리 버려짐
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
