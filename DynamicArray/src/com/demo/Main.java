package com.demo;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array<>();

        arr.set(0, 1);
        arr.set(1, 2);

        System.out.println(arr);
        arr.forEach(System.out::println);

        arr.removeAt(1);

        System.out.println(arr);
        System.out.println(arr.size());

        arr.add(3);

        System.out.println(arr);
        System.out.println(arr.size());
    }
}
