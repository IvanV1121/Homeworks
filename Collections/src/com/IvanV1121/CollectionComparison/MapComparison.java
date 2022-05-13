package com.IvanV1121.CollectionComparison;

import com.IvanV1121.MyLinkedList.Timer;

import java.util.*;

public class MapComparison {

    private Timer timer = new Timer();
    private int numberOfAverage = 10;
    private int[] numberOfTests = new int[]{10000, 30000, 50000, 100000, 300000, 500000, 1000000};

    public MapComparison() {}

    private long Create(Map<Integer, String> map, int numberOfTests) {
        timer.startTime();
        String value = "Value";
        for (int i = 0; i < numberOfTests; i++) {
            map.put(i, value);
        }
        return timer.timeElapsed();
    }

    private long Add(Map<Integer, String> map, Integer key, String value) {
        timer.startTime();
        map.put(key, value);
        return timer.timeElapsed();
    }

    private long Get(Map<Integer, String> map, Integer key) {
        timer.startTime();
        map.containsKey(key);
        return timer.timeElapsed();
    }

    private long Remove(Map<Integer, String> map, Integer key) {
        timer.startTime();
        map.remove(key);
        return timer.timeElapsed();
    }

    public void test() {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        long[] resCreateHashMap = new long[numberOfTests.length];
        long[] resCreateLinkedHashMap = new long[numberOfTests.length];
        long[] resCreateTreeMap = new long[numberOfTests.length];

        long[] resAddHashMap = new long[numberOfTests.length];
        long[] resAddLinkedHashMap = new long[numberOfTests.length];
        long[] resAddTreeMap = new long[numberOfTests.length];

        long[] resGetHashMap = new long[numberOfTests.length];
        long[] resGetLinkedHashMap = new long[numberOfTests.length];
        long[] resGetTreeMap = new long[numberOfTests.length];

        long[] resRemoveHashMap = new long[numberOfTests.length];
        long[] resRemoveLinkedHashMap = new long[numberOfTests.length];
        long[] resRemoveTreeMap = new long[numberOfTests.length];

        for (int i = 0; i < numberOfTests.length; i++) {
            for (int j = 0; j < numberOfAverage; j++) {
                resCreateHashMap[i] = Create(hashMap, numberOfTests[i]);
                resCreateLinkedHashMap[i] = Create(linkedHashMap, numberOfTests[i]);
                resCreateTreeMap[i] = Create(treeMap, numberOfTests[i]);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resAddHashMap[i] = Add(hashMap, numberOfTests[i]/2, "Value");
                resAddLinkedHashMap[i] = Add(linkedHashMap, numberOfTests[i]/2, "Value");
                resAddTreeMap[i] = Add(treeMap, numberOfTests[i]/2, "Value");
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resGetHashMap[i] = Get(hashMap, numberOfTests[i]/2);
                resGetLinkedHashMap[i] = Get(linkedHashMap, numberOfTests[i]/2);
                resGetTreeMap[i] = Get(treeMap, numberOfTests[i]/2);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resRemoveHashMap[i] = Remove(hashMap, numberOfTests[i]/2);
                resRemoveLinkedHashMap[i] = Remove(linkedHashMap, numberOfTests[i]/2);
                resRemoveTreeMap[i] = Remove(treeMap, numberOfTests[i]/2);
            }

            resCreateHashMap[i] /= numberOfAverage;
            resCreateLinkedHashMap[i] /= numberOfAverage;
            resCreateTreeMap[i] /= numberOfAverage;

            resAddHashMap[i] /= numberOfAverage;
            resAddLinkedHashMap[i] /= numberOfAverage;
            resAddTreeMap[i] /= numberOfAverage;

            resGetHashMap[i] /= numberOfAverage;
            resGetLinkedHashMap[i] /= numberOfAverage;
            resGetTreeMap[i] /= numberOfAverage;

            resRemoveHashMap[i] /= numberOfAverage;
            resRemoveLinkedHashMap[i] /= numberOfAverage;
            resRemoveTreeMap[i] /= numberOfAverage;

        }
        System.out.println("Map Comparison");
        System.out.println("========================================================================================");
        System.out.println("Create HashMap: " + Arrays.toString(resCreateHashMap));
        System.out.println("Create LinkedHashMap: " + Arrays.toString(resCreateLinkedHashMap));
        System.out.println("Create TreeMap: " + Arrays.toString(resCreateTreeMap));
        System.out.println("========================================================================================");
        System.out.println("Add to HashMap: " + Arrays.toString(resAddHashMap));
        System.out.println("Add to LinkedHashMap: " + Arrays.toString(resAddLinkedHashMap));
        System.out.println("Add to TreeMap: " + Arrays.toString(resAddTreeMap));
        System.out.println("========================================================================================");
        System.out.println("Get from HashMap: " + Arrays.toString(resGetHashMap));
        System.out.println("Get from LinkedHashMap: " + Arrays.toString(resGetLinkedHashMap));
        System.out.println("Get from TreeMap: " + Arrays.toString(resGetTreeMap));
        System.out.println("========================================================================================");
        System.out.println("Remove from HashMap: " + Arrays.toString(resRemoveHashMap));
        System.out.println("Remove from LinkedHashMap: " + Arrays.toString(resRemoveLinkedHashMap));
        System.out.println("Remove from TreeMap: " + Arrays.toString(resRemoveTreeMap));
        System.out.println("========================================================================================");
    }
}
