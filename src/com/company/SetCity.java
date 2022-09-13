package com.company;

import java.util.Set;
import java.util.TreeSet;

public class SetCity {
    private Set<City> tree = new TreeSet<>();


    public boolean addCity(int code, String name, long people) {
        boolean result = code > 0;
        if (result) {
            if (code % 2 == 1) {
            tree.add(new City(code, name, people));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "SetCity{" +
                "tree=" + tree +
                '}';
    }
}
