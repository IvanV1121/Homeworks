package com.IvanV1121.Homework2Part2.Chapter3;

/*Support computing sales tax in the CashRegister class. The tax rate should be supplied
when constructing a CashRegister object. Add recordTaxablePurchase and getTotal-
Tax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
method should correctly reflect the sales tax that is charged on taxable items.*/

public class CashRegisterTax{

    private int countPurchase = 0;
    private double purchase = 0;
    private double purchaseTax = 0;
    private double payment = 0;
    private double orderTax = 0;
    private double tax;

    public CashRegisterTax(double tax) {
        this.tax = tax;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        countPurchase++;
    }

    public void recordTaxablePurchase(double amount) {
        orderTax += amount * tax / 100;
        purchaseTax +=  amount * (1 + tax / 100);
        countPurchase++;
    }

    public double getTotalTax(){
        return orderTax;
    }

    public void receivePayment(double amount)
    {
        payment = payment + amount;
    }

    public double giveChange()
    {
        double change = payment - (purchase + purchaseTax);
        if (change >= 0){
            purchase = 0;
            payment = 0;
            return change;
        } else {
            return -1;
        }
    }

    public int getItemCount(){
        return countPurchase;
    }
}

