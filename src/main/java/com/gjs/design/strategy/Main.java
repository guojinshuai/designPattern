package com.gjs.design.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat[] a = {new Cat(1), new Cat(5), new Cat(3)};
        Sorter sorter = new Sorter();
        sorter.sort(a, (t1, t2) -> ((Dog) t1).food - ((Dog) t2).food);
        System.out.println(Arrays.toString(a));
    }
}
