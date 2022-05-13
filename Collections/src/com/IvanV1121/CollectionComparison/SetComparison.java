package com.IvanV1121.CollectionComparison;

import com.IvanV1121.MyLinkedList.Timer;

import java.util.*;

public class SetComparison {

    private Timer timer = new Timer();
    private int numberOfAverage = 10;
    private int[] numberOfTests = new int[]{10000, 30000, 50000, 100000, 300000, 500000, 1000000};

    public SetComparison() {}

    private long Create(Set<Integer> set, int numberOfTests) {
        timer.startTime();
        for (int i = 0; i < numberOfTests; i++) {
            set.add(i);
        }
        return timer.timeElapsed();
    }

    private long Add(Set<Integer> set, Integer element) {
        timer.startTime();
        set.add(element);
        return timer.timeElapsed();
    }

    private long Get(Set<Integer> set, Integer element) {
        timer.startTime();
        set.contains(element);
        return timer.timeElapsed();
    }

    private long Remove(Set<Integer> set, Integer element) {
        timer.startTime();
        set.remove(element);
        return timer.timeElapsed();
    }

    public void test() {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long[] resCreateHashSet = new long[numberOfTests.length];
        long[] resCreateLinkedHashSet = new long[numberOfTests.length];
        long[] resCreateTreeSet = new long[numberOfTests.length];

        long[] resAddHashSet = new long[numberOfTests.length];
        long[] resAddLinkedHashSet = new long[numberOfTests.length];
        long[] resAddTreeSet = new long[numberOfTests.length];

        long[] resGetHashSet = new long[numberOfTests.length];
        long[] resGetLinkedHashSet = new long[numberOfTests.length];
        long[] resGetTreeSet = new long[numberOfTests.length];

        long[] resRemoveHashSet = new long[numberOfTests.length];
        long[] resRemoveLinkedHashSet = new long[numberOfTests.length];
        long[] resRemoveTreeSet = new long[numberOfTests.length];

        for (int i = 0; i < numberOfTests.length; i++) {
            for (int j = 0; j < numberOfAverage; j++) {

                resCreateHashSet[i] = Create(hashSet, numberOfTests[i]);
                resCreateLinkedHashSet[i] = Create(linkedHashSet, numberOfTests[i]);
                resCreateTreeSet[i] = Create(treeSet, numberOfTests[i]);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resAddHashSet[i] = Add(hashSet, numberOfTests[i]/2);
                resAddLinkedHashSet[i] = Add(linkedHashSet, numberOfTests[i]/2);
                resAddTreeSet[i] = Add(treeSet, numberOfTests[i]/2);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resGetHashSet[i] = Get(hashSet, numberOfTests[i]/2);
                resGetLinkedHashSet[i] = Get(linkedHashSet, numberOfTests[i]/2);
                resGetTreeSet[i] = Get(treeSet, numberOfTests[i]/2);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resRemoveHashSet[i] = Remove(hashSet, numberOfTests[i]/2);
                resRemoveLinkedHashSet[i] = Remove(linkedHashSet, numberOfTests[i]/2);
                resRemoveTreeSet[i] = Remove(treeSet, numberOfTests[i]/2);
            }

            resCreateHashSet[i] /= numberOfAverage;
            resCreateLinkedHashSet[i] /= numberOfAverage;
            resCreateTreeSet[i] /= numberOfAverage;

            resAddHashSet[i] /= numberOfAverage;
            resAddLinkedHashSet[i] /= numberOfAverage;
            resAddTreeSet[i] /= numberOfAverage;

            resGetHashSet[i] /= numberOfAverage;
            resGetLinkedHashSet[i] /= numberOfAverage;
            resGetTreeSet[i] /= numberOfAverage;

            resRemoveHashSet[i] /= numberOfAverage;
            resRemoveLinkedHashSet[i] /= numberOfAverage;
            resRemoveTreeSet[i] /= numberOfAverage;

        }
        System.out.println("Set Comparison");
        System.out.println("========================================================================================");
        System.out.println("Create HashSet: " + Arrays.toString(resCreateHashSet));
        System.out.println("Create LinkedHashSet: " + Arrays.toString(resCreateLinkedHashSet));
        System.out.println("Create TreeSet: " + Arrays.toString(resCreateTreeSet));
        System.out.println("========================================================================================");
        System.out.println("Add to HashSet: " + Arrays.toString(resAddHashSet));
        System.out.println("Add to LinkedHashSet: " + Arrays.toString(resAddLinkedHashSet));
        System.out.println("Add to TreeSet: " + Arrays.toString(resAddTreeSet));
        System.out.println("========================================================================================");
        System.out.println("Get from HashSet: " + Arrays.toString(resGetHashSet));
        System.out.println("Get from LinkedHashSet: " + Arrays.toString(resGetLinkedHashSet));
        System.out.println("Get from TreeSet: " + Arrays.toString(resGetTreeSet));
        System.out.println("========================================================================================");
        System.out.println("Remove from HashSet: " + Arrays.toString(resRemoveHashSet));
        System.out.println("Remove from LinkedHashSet: " + Arrays.toString(resRemoveLinkedHashSet));
        System.out.println("Remove from TreeSet: " + Arrays.toString(resRemoveTreeSet));
        System.out.println("========================================================================================");
    }
}

