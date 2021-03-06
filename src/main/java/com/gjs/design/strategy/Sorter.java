package com.gjs.design.strategy;

public class Sorter<T> {

    public void sort(T[] a, Comparator<T> comparator) {
        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = comparator.compareTo(a[j], a[i]) < 0 ? j : minPos;
            }
            swap(a, i, minPos);
        }
    }

    private void swap(T[] a, int i, int minPos) {
        T t = a[i];
        a[i] = a[minPos];
        a[minPos] = t;
    }
}
