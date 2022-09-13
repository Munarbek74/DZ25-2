package com.company;


public class Main {

    public static void main(String[] args)  {
	// write your code here

        SetCity cities = new SetCity();
        cities.addCity(720000, "Bishkek", 1000000);
        cities.addCity(723500, "Osh", 438445);
        cities.addCity(722125, "Cholpon Ata", 10525);
        cities.addCity(720701, "Isfana", 27962);
        cities.addCity(721600, "Toktogul", 123184);
        cities.addCity(722601, "Naryn", 34822);


        System.out.println(cities);
    }

}
