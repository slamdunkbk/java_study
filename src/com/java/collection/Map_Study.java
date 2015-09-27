
package com.java.collection;

import java.util.*;

public class Map_Study {
    public static void main(String[] args) {
        // Map은 key와 value로 구성이 되어 있다
        // 제네릭을 사용하여 key, value의 데이터 타입을 지정한다
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        // key는 중복될 수 없으나, value는 중복 될 수 있다.
        // put을 이용하여 데이터를 삽입
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        // get을 이용하여 해당 key의 value를 불러 올 수 있다
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    // map은 Iterator 기능이 없으므로 entrySet메소드를 사용하여 map->set 변환 후 사용
    static void iteratorUsingForEach(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // entrySet을 통해 set으로 변환후 Iterator 메소드 사용
    static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
