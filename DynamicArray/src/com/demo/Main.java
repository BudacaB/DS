package com.demo;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        OwnArray arr = new OwnArray();

        arr.set(0, 1);
        arr.set(1, 2);

        System.out.println(arr);
        arr.forEach(System.out::println);

        arr.removeAt(1);

        System.out.println(arr);
        System.out.println(arr.size());

        arr.add(3);

        Iterator iterator = arr.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println(arr);
        System.out.println(arr.size());
    }
}
