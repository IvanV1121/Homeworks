package com.IvanV1121.Homework2Part2.Chapter3;

public class Main {
    public static void main(String[] args){

        System.out.println("PurchaseCounter_Exercise3.1");

        CashRegisterModified register1 = new CashRegisterModified();
        register1.recordPurchase(15.0);
        register1.recordPurchase(10.50);
        register1.recordPurchase(5.0);
        register1.recordPurchase(20.50);
        register1.recordPurchase(30.00);

        register1.receivePayment(100);

        System.out.println("Change: "  + register1.giveChange());
        System.out.println("Counter: " + register1.getItemCount());

        System.out.println("PurchaseTax_Exercise3.2");
        CashRegisterTax register2 = new CashRegisterTax(10.0);
        register2.recordPurchase(15.0);
        register2.recordPurchase(10.0);
        register2.recordPurchase(5.0);
        register2.recordTaxablePurchase(20.0);
        register2.recordTaxablePurchase(30.0);

        register2.receivePayment(100);

        System.out.println("Change: "  + register2.giveChange());
        System.out.println("Counter: " + register2.getItemCount());
        System.out.println("Order tax: "  + register2.getTotalTax());

        System.out.println("Sheet_Exercise3.4");
        Sheet sheet = new Sheet();
        System.out.println(sheet.getWidth());
        System.out.println(sheet.getHeight());

        Sheet sheet2 = Sheet.cutInHalf(sheet);
        System.out.println(sheet2.getWidth());
        System.out.println(sheet2.getHeight());

        Sheet sheet3 = Sheet.cutInHalf(sheet2);
        System.out.println(sheet3.getWidth());
        System.out.println(sheet3.getHeight());

        Sheet sheet4 = Sheet.cutInHalf(sheet3);
        System.out.println(sheet4.getWidth());
        System.out.println(sheet4.getHeight());

        System.out.println(Sheet.nameOfSheet(sheet4));

        System.out.println("Person_Exercise3.6,3.7");

        Person person = new Person("David");
        person.beFriend("David1");
        person.beFriend("David2");
        person.beFriend("David3");
        System.out.println(person.getFriendNames());
        System.out.println(person.friendCount());
        person.unFriend("David2");
        System.out.println(person.getFriendNames());
        System.out.println(person.friendCount());

        System.out.println("Student_Exercise3.8");

        Student student1 = new Student("Student1");
        student1.addQuiz(5);
        student1.addQuiz(4);
        student1.addQuiz(3);
        student1.addQuiz(2);
        student1.addQuiz(5);
        student1.addQuiz(5);
        System.out.println(student1.getTotalScore());
        System.out.println(student1.getAverageScore());
        System.out.println(student1.getName());
        System.out.println(student1);

        System.out.println("Battery_Exercise3.9");

        Battery battery = new Battery(2000);
        battery.drain(500);
        battery.drain(1000);
        System.out.println("Сurrent capacity: " + battery.getRemainingCapacity());
        battery.charge();
        System.out.println("Сurrent capacity: " + battery.getRemainingCapacity());

    }
}
