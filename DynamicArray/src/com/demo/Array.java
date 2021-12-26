package com.demo;

import java.util.Iterator;
@SuppressWarnings("unchecked")
public class Array <T> implements Iterable <T> {

    private T[] arr;
    private int len = 0; // length user thinks array is
    private int capacity = 0; // actual array size

    public Array() {
        this(16); // this() can be used to invoke current class constructor
     }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
