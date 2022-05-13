package com.IvanV1121.CollectionComparison;

import com.IvanV1121.MyLinkedList.Timer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {

    private Timer timer = new Timer();
    private int numberOfAverage = 10;
    private int[] numberOfTests = new int[]{10000, 30000, 50000, 100000, 300000, 500000, 1000000};

    public ListComparison() {}

    private long Create(List<Integer> list, int numberOfTests) {
        timer.startTime();
        for (int i = 0; i < numberOfTests; i++) {
            list.add(i);
        }
        return timer.timeElapsed();
    }

    private long Add(List<Integer> list, int index, Integer element) {
        timer.startTime();
        list.add(index, element);
        return timer.timeElapsed();
    }

    private long Get(List<Integer> list, int index) {
        timer.startTime();
        list.get(index);
        return timer.timeElapsed();
    }

    private long Remove(List<Integer> list, int index) {
        timer.startTime();
        list.remove(index);
        return timer.timeElapsed();
    }

    public void test() {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long[] resCreateArrayList = new long[numberOfTests.length];
        long[] resCreateLinkedList = new long[numberOfTests.length];

        long[] resAddTopArrayList = new long[numberOfTests.length];
        long[] resAddTopLinkedList = new long[numberOfTests.length];

        long[] resAddMiddleArrayList = new long[numberOfTests.length];
        long[] resAddMiddleLinkedList = new long[numberOfTests.length];

        long[] resAddEndArrayList = new long[numberOfTests.length];
        long[] resAddEndLinkedList = new long[numberOfTests.length];

        long[] resGetArrayList = new long[numberOfTests.length];
        long[] resGetLinkedList = new long[numberOfTests.length];

        long[] resRemoveArrayList = new long[numberOfTests.length];
        long[] resRemoveLinkedList = new long[numberOfTests.length];

        for (int i = 0; i < numberOfTests.length; i++) {
            for (int j = 0; j < numberOfAverage; j++) {
                arrayList.clear();
                linkedList.clear();
                resCreateArrayList[i] += Create(arrayList, numberOfTests[i]);
                resCreateLinkedList[i] += Create(linkedList, numberOfTests[i]);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resAddTopArrayList[i] += Add(arrayList, 1, 1);
                resAddTopLinkedList[i] += Add(linkedList, 1, 1);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resAddMiddleArrayList[i] += Add(arrayList, numberOfTests[i]/2, 1);
                resAddMiddleLinkedList[i] += Add(linkedList, numberOfTests[i]/2, 1);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resAddEndArrayList[i] += Add(arrayList, numberOfTests[i], 1);
                resAddEndLinkedList[i] += Add(linkedList, numberOfTests[i], 1);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resGetArrayList[i] += Get(arrayList, numberOfTests[i]/2);
                resGetLinkedList[i] += Get(linkedList, numberOfTests[i]/2);
            }
            for (int j = 0; j < numberOfAverage; j++) {
                resRemoveArrayList[i] += Remove(arrayList, numberOfTests[i]/2);
                resRemoveLinkedList[i] += Remove(linkedList, numberOfTests[i]/2);
            }

            resCreateArrayList[i] /= numberOfAverage;
            resCreateLinkedList[i] /= numberOfAverage;

            resAddTopArrayList[i] /= numberOfAverage;
            resAddTopLinkedList[i] /= numberOfAverage;

            resAddMiddleArrayList[i] /= numberOfAverage;
            resAddMiddleLinkedList[i] /= numberOfAverage;

            resAddEndArrayList[i] /= numberOfAverage;
            resAddEndLinkedList[i] /= numberOfAverage;

            resGetArrayList[i] /= numberOfAverage;
            resGetLinkedList[i] /= numberOfAverage;

            resRemoveArrayList[i] /= numberOfAverage;
            resRemoveLinkedList[i] /= numberOfAverage;

        }
        System.out.println("List Comparison");
        System.out.println("========================================================================================");
        System.out.println("Create ArrayList: " + Arrays.toString(resCreateArrayList));
        System.out.println("Create LinkedList: " + Arrays.toString(resCreateLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Add to the top ArrayList: " + Arrays.toString(resAddTopArrayList));
        System.out.println("Add to the top LinkedList: " + Arrays.toString(resAddTopLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Add to the middle ArrayList: " + Arrays.toString(resAddMiddleArrayList));
        System.out.println("Add to the middle LinkedList: " + Arrays.toString(resAddMiddleLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Add to the end ArrayList: " + Arrays.toString(resAddEndArrayList));
        System.out.println("Add to the end LinkedList: " + Arrays.toString(resAddEndLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Get from ArrayList: " + Arrays.toString(resGetArrayList));
        System.out.println("Get from LinkedList: " + Arrays.toString(resGetLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Remove from ArrayList: " + Arrays.toString(resRemoveArrayList));
        System.out.println("Remove from LinkedList: " + Arrays.toString(resRemoveLinkedList));
        System.out.println("========================================================================================");
    }
}
