package com.siorae;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // float (5.4) <-- possible like byte and short
        double myDoubleValue = 5d / 3d;

        //System.out.println("myIntValue = " + myIntValue);
        //System.out.println("myFloatValue = " + myFloatValue);
        //System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 235.20d;
        double kilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    }
}
