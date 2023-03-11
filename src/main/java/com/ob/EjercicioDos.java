package com.ob;

public class EjercicioDos {
    private static final double IVA = 0.21;

    public static void main(String[] args) {

        double price = 100.00;

        double priceWithIVA = getPriceWithIVA(price);
        System.out.println(priceWithIVA);

    }

    private static double getPriceWithIVA(double price) {
        return price + price*IVA;
    }
}