
package com.java.reference;

class A {
    public int id;

    A(int id) {
        this.id = id;
    }
}

// 기본 데이터 타입을 가진 각각 변수들은 직접 가지고 있다
// 기본 데이터 타입이 아닌 변수들은 해당 값을 참조한다
public class Reference {
    // 상수 1이 복제가 일어나서 변수 b에 담기므로 a의 값에는 영향을 미치지 않는다
    public static void runValue() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, " + a);
    }

    // a와 b가 같은 주소의 인스턴트 값을 참조하고 있으므로 같이 변경된다
    public static void runReference() {
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, " + a.id);
    }

    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
