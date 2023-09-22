package com.company;

import java.util.*;


public class SixthTask<T> {
    private Set<T> set;
    private List<T> list;

    public SixthTask() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public void add(T item) {
        if (!set.contains(item)) {
            set.add(item);
            list.add(item);
        }
    }

    public void remove(T item) {
        if (set.contains(item)) {
            set.remove(item);
            list.remove(item);
        }
    }

    public boolean contains(T item) {
        return set.contains(item);
    }

    public T removeFirst() {
        if (!list.isEmpty()) {
            T first = list.get(0);
            set.remove(first);
            list.remove(0);
            return first;
        }
        throw new NoSuchElementException("This is empty");
    }

    public int size() {
        return list.size();
    }

}


