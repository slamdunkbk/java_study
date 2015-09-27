
package com.java.method;

public class Method_edu4 {
    // 반환되는 결과값이 int가 아닌 문자열 일수도 있으므로 String 매소드로 지정된다
    // void는 리턴값이 존재하지 않을때만 사용
    public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들이 output 변수에 담기위해 변수 초기화
        String output = "";
        // 증가하는 변수들을 output에 추가
        while (i <= limit) {
            output += i;
            i++;
        }
        // output 변수 반환되고 해당 매소드 종료!
        return output;
    }

    public static void main(String[] args) {
        // 매소드 numbering이 리턴한 값을 result 변수에 담는다
        String result = numbering(3, 5);
        System.out.println(result);
    }
}
