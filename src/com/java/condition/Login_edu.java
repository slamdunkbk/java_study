
package com.java.condition;

public class Login_edu {
    public static void main(String[] args) {
        // args[0]는 해당 파일의 실행시킬때 뒤에 첫번째 오는 값을 의미
        String id = args[0];
        if (id.equals("jaemin")) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
