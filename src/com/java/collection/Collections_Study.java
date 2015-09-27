
package com.java.collection;

import java.util.*;

//sort를 사용하기 위해선 implements Comparable 해야된다.
class Computer implements Comparable {
    int serial;

    String owner;

    Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }

    // Comparable을 구현하기 위해선 compareTo(T o)를 가지고 있어야된다
    public int compareTo(Object o) {
        return this.serial - ((Computer)o).serial;
    }

    public String toString() {
        return serial + " " + owner;
    }
}

public class Collections_Study {

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "jaemin"));
        computers.add(new Computer(200, "hihi"));
        computers.add(new Computer(100, "kkk"));
        Iterator<Computer> i = computers.iterator();
        System.out.println("before");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // Collections클래스의 sort를 불러온다(List만 가능)
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
