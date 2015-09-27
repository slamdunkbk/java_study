
package com.java.io;

// Scanner 라이브러리 import
import java.util.Scanner;

public class Scanner_edu {
    public static void main(String[] args) {
        // System.in = 사용자가 입력한 값
        // Scanner 객체를 새로 만들면서 System.in으로 초기화한후, sc라는 변수이 입력
        Scanner sc = new Scanner(System.in);
        // nextInt매소드 : 일정 정지 후, sc변수의 값이 들어온 순간 Int로 변환하여 이후 실행
        int i = sc.nextInt();
        System.out.println(i * 1000);
        sc.close();
    }
}
