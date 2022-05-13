package com.IvanV1121.CollectionComparison;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================================================================");
        ListComparison listComparison = new ListComparison();
        listComparison.test();
        System.out.println("========================================================================================");
        SetComparison setComparison = new SetComparison();
        setComparison.test();
        System.out.println("========================================================================================");
        MapComparison mapComparison = new MapComparison();
        mapComparison.test();
        System.out.println("========================================================================================");
        
    }
}
