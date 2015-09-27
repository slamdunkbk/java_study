
package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);
        // containsAll: 부분집합 (A안에 모든 요소를 포함하고 있는 경우에만 true)
        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true
        // addALL: 합집합(전체)
        A.addAll(B);
        // retainAll: 교집합(공동분모)
        A.retainAll(B);
        // removeAll: 차집합(A-B의 결과)
        A.removeAll(B);
        // Iterator: 모든 컬렉션(Collection)으로 부터 정보를 얻을 수 있는 인터페이스
        Iterator<Integer> hi = A.iterator();
        // hasNext() : 다음 값이 있는지 없는지 확인, 있으면 true를 리턴하고 없으면 false를 리턴
        while (hi.hasNext()) {
            // next: 다음 값을 리턴
            System.out.println(hi.next());
        }
    }
}
