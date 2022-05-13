package com.IvanV1121.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================================================================");

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("Add(E element)");
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i);
        }
        System.out.println("List: " + myLinkedList);
        System.out.println("Size of the list: " + myLinkedList.size());

        System.out.println("========================================================================================");

        System.out.println("Add(int index, E element)");
        myLinkedList.add(10, 10);
        myLinkedList.add(0, 11);
        myLinkedList.add(5, 12);
        System.out.println("List: " + myLinkedList);
        System.out.println("Size of the list: " + myLinkedList.size());

        System.out.println("========================================================================================");

        System.out.println("Get(int index()");
        int getIndexValue = myLinkedList.get(4);
        System.out.println("Value in " + getIndexValue + " position");
        System.out.println(getIndexValue);

        System.out.println("========================================================================================");

        System.out.println("IndexOf(E element");
        System.out.println(myLinkedList.indexOf(5));
        System.out.println(myLinkedList.indexOf(15));

        System.out.println("========================================================================================");

        System.out.println("Remove(int index)");
        System.out.println("Deleted value: " + myLinkedList.remove(0));
        System.out.println("List without first element: " + myLinkedList);
        System.out.println("Deleted value: " + myLinkedList.remove(myLinkedList.size - 1));
        System.out.println("List without last element: " + myLinkedList);
        System.out.println("Deleted value: " + myLinkedList.remove(4));
        System.out.println("List without fourth element: " + myLinkedList);

        System.out.println("========================================================================================");

        System.out.println("Set(int index)");
        System.out.println("Replaced value: " + myLinkedList.set(6, 5));
        System.out.println("List with set fifth element: " + myLinkedList);

        System.out.println("========================================================================================");

        System.out.println("Clear()");
        myLinkedList.clear();
        System.out.println("List: " + myLinkedList);
        System.out.println("Size of the list: " + myLinkedList.size());

        System.out.println("========================================================================================");

        System.out.println("Comparison Lists");

        ListComparison comparisonLists = new ListComparison();
        comparisonLists.testLinkedLists();
    }
}
