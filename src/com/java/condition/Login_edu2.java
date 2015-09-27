
package com.java.condition;

public class Login_edu2 {
    public static void main(String[] args) {
        String id = args[0];
        String passwd = args[1];
        if (id.equals("jaemin")) {
            if (passwd.equals("woals")) {
                System.out.println("good");
            } else {
                System.out.println("bad");
            }
        }
    }
}
