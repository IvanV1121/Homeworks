package com.IvanV1121.Homework2Part2.Chapter3;

/*A Person has a name (just a first name for simplicity) and friends. Store the names of
the friends in a string, separated by spaces. Provide a constructor that constructs a
person with a given name and no friends. Provide methods
public void befriend(Person p)
public void unfriend(Person p)
public String getFriendNames()*/

/*Add a method
public int getFriendCount()
to the Person class of Exercise •• P3.6.*/

public class Person {

    private String name = "";
    private String friends = "";
    private int friendCounter = 0;

    public Person(String name) {
        this.name = name;
    }

    public void beFriend(String name) {
        if (friends.length() == 0){
            friends = friends + name;
        } else {
            friends = friends + " " + name;
        }
        friendCounter++;
    }

    public void unFriend(String name){
        friends = friends.replace(" " + name + " ", " ");
        friendCounter--;
    }

    public String getFriendNames(){
        return friends;
    }

    public int friendCount(){
        return friendCounter;
    }

    @Override
    public String toString() {
        return "Person "+ this.name + " with friends " + this.getFriendNames();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass().equals(obj.getClass())) {
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.getFriendNames().equals(person.getFriendNames());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.getFriendNames().hashCode();
        return result;
    }
}
