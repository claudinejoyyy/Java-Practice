package com.siorae;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        myString = myString + ", and this is more.";
        myString = myString + " \u00A9 2015";
        //System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        //System.out.println(numberString);

        String lastString = "10";
        int intValue = 50;
        lastString = lastString + intValue; // <-- lastString = 1050
        //System.out.println(lastString);
        double doubleValue = 120.47;
        lastString = lastString + doubleValue;
        //System.out.println(lastString);
    }
}
