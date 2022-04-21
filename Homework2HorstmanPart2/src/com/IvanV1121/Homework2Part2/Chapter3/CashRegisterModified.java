package com.IvanV1121.Homework2Part2.Chapter3;

/*Enhance the CashRegister class so that it counts the purchased items. Provide a get-
ItemCount method that returns the count.*/

public class CashRegisterModified{

    private int countPurchase = 0;
    private double purchase = 0;
    private double payment = 0;

    public CashRegisterModified() {
        countPurchase = 0;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        countPurchase++;
    }

    public void receivePayment(double amount)
    {
        payment = payment + amount;
    }

    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public int getItemCount(){
        return countPurchase;
    }
}

