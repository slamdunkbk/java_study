
package com.java.io;

import java.util.Scanner;
import java.io.*;

public class Scanner_edu3 {
    public static void main(String[] args) {
        // 예외처리
        try {
            // file 이라는 변수에 out_test.txt 파일의 내용을 객체화
            File file = new File("out_test.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 1000);
            }
            sc.close();
            // 예외처리 : 파일이 존재 하지 않는다면
        } catch (FileNotFoundException e) {
            // 해당 에러의 내용을 출력
            e.printStackTrace();
        }
    }
}
