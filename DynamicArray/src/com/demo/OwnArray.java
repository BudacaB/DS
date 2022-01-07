package com.demo;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class OwnArray <T> implements Iterable {
    private T[] arr;
    private int len;
    private int capacity;

    public OwnArray() {
        this(16);
    }

    public OwnArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.arr = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public int size() { return len; }
    public boolean isEmpty() { return size() == 0; }

    public T get(int index) {
        if (index >= capacity || index < 0) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void set(int index, T elem) {
        if (index >= capacity || index < 0) throw new IndexOutOfBoundsException();
        arr[index] = elem;
        len++;
    }

    public void clear() {
        for (int i = 0; i < capacity ; i++)
            arr[i] = null;
        len = 0;
    }

    public void add(T elem) {
        if (len + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2;
            T[] new_arr = (T[]) new Object[capacity];
            if (len >= 0) System.arraycopy(arr, 0, new_arr, 0, len);
            arr = new_arr;
        }
        arr[len++] = elem;
    }

    public T removeAt(int rm_index) {
        if (rm_index >= len || rm_index < 0) throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i = 0, j = 0; i < len; i++, j++) {
            if (i == rm_index) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --len;
        return data;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (len == 0) return "[]";
        else {
            StringBuilder contents = new StringBuilder(len).append("[");
            for (int i = 0; i < len - 1; i++)
                contents.append(arr[i]).append(", ");
            return contents.append(arr[len - 1]).append("]").toString();
        }
    }
}
