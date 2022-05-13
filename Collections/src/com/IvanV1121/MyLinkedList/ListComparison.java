package com.IvanV1121.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ListComparison {

    private Timer timer = new Timer();
    private int numberOfAverage = 100;
    private int[] numberOfElements = new int[]{10000, 30000, 50000, 100000, 300000, 500000, 1000000, 3000000, 5000000, 10000000};

    public ListComparison() {}

    private long Add(MyLinkedList<Integer> myLinkedList, int index, Integer element) {
        timer.startTime();
        myLinkedList.add(index, element);
        return timer.timeElapsed();
    }

    private long Add(LinkedList<Integer> linkedList, int index, Integer element) {
        timer.startTime();
        linkedList.add(index, element);
        return timer.timeElapsed();
    }

    private long Get(MyLinkedList<Integer> myLinkedList, int index) {
        timer.startTime();
        myLinkedList.get(index);
        return timer.timeElapsed();
    }

    private long Get(LinkedList<Integer> linkedList, int index) {
        timer.startTime();
        linkedList.get(index);
        return timer.timeElapsed();
    }

    private long Remove(MyLinkedList<Integer> myLinkedList, int index) {
        timer.startTime();
        myLinkedList.remove(index);
        return timer.timeElapsed();
    }

    private long Remove(LinkedList<Integer> linkedList, int index) {
        timer.startTime();
        linkedList.remove(index);
        return timer.timeElapsed();
    }

    public void testLinkedLists() {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long[] resultAddMyList = new long[numberOfElements.length];
        long[] resultGetMyList = new long[numberOfElements.length];
        long[] resultsRemoveMyList = new long[numberOfElements.length];

        long[] resultAddLinkedList = new long[numberOfElements.length];
        long[] resultGetLinkedList  = new long[numberOfElements.length];
        long[] resultsRemoveLinkedList  = new long[numberOfElements.length];

        for (int i = 0; i < numberOfElements.length; i++) {

            for (int j = 0; j < numberOfElements[i]; j++) {
                myLinkedList.add(j);
                linkedList.add(j);
            }

            for (int k = 0; k < numberOfAverage; k++) {
                resultAddMyList[i] = Add(myLinkedList, (numberOfElements[i] / 2) - 1,1);
                resultAddLinkedList[i] = Add(linkedList, (numberOfElements[i] / 2) - 1, 1);
            }

            for (int k = 0; k < numberOfAverage; k++) {
                resultGetMyList[i] = Get(myLinkedList, (numberOfElements[i] / 2) - 1);
                resultGetLinkedList[i] = Get(linkedList, (numberOfElements[i] / 2) - 1);
            }

            for (int k = 0; k < numberOfAverage; k++) {
                resultsRemoveMyList[i] = Remove(myLinkedList, (numberOfElements[i] / 2) - 1);
                resultsRemoveLinkedList[i] = Remove(linkedList, (numberOfElements[i] / 2) - 1);
            }

            resultAddMyList[i] /= numberOfAverage;
            resultAddLinkedList[i] /= numberOfAverage;
            resultGetMyList[i] /= numberOfAverage;
            resultGetLinkedList[i] /= numberOfAverage;
            resultsRemoveMyList[i] /= numberOfAverage;
            resultsRemoveLinkedList[i] /= numberOfAverage;

        }
        System.out.println("========================================================================================");
        System.out.println("Add to MyLinkedList" + Arrays.toString(resultAddMyList));
        System.out.println("Add to LinkedList" + Arrays.toString(resultAddLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Get from MyLinkedList" + Arrays.toString(resultGetMyList));
        System.out.println("Get from LinkedList" + Arrays.toString(resultGetLinkedList));
        System.out.println("========================================================================================");
        System.out.println("Remove from MyLinkedList" + Arrays.toString(resultsRemoveMyList));
        System.out.println("Remove from LinkedList" + Arrays.toString(resultsRemoveLinkedList));
        System.out.println("========================================================================================");
    }
}


