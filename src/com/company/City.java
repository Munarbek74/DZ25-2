package com.company;

import java.util.Set;
import java.util.TreeSet;

public class City implements Comparable<City> {
    private int code;
    private String name;
    private long people;


    public City(int code, String name, long people) {
        this.code = code;
        this.name = name;
        this.people = people;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPeople() {
        return people;
    }

    public void setPeople(long people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", people=" + people +
                '}';
    }


    @Override
    public int compareTo(City o) {
        return this.code - o.code;
    }
}
