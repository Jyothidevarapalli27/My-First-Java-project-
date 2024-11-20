package com.perscholas.java.basics;

public class Cafe {
    public static void main (String [] args){
        double coffeePrice = 3.50;
        double cappuccinoPrice = 5.00;
        double greenTeaPrice = 3.05;

        int numOfCoffee = 3;
        int numOfCappuccino = 4;
        int numOfGreenTea = 2;

        double subTotal = (coffeePrice * numOfCoffee ) + (cappuccinoPrice * numOfCappuccino) + (greenTeaPrice * numOfGreenTea);

        final double Sale_Tax = 0.07;
        double totalSale = (subTotal * Sale_Tax);

        System.out.printf("subtotal: $%.2f%n", subTotal);
        System.out.printf("Total Sale(including tax): $%.2f%n",totalSale);








    }

}
