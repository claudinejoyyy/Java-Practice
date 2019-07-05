package com.siorae;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        //System.out.println("myTotal = " + myTotal);

        // - 128 to 127 (processing time = quarter of an int)
        byte myByteValue = -128; // <--literal
        // byte myNewByteValue = (myByteValue/2); // <-- expression so error
        byte myNewByteValue = (byte) (myByteValue/2);
        //System.out.println("myNewByteValue = " + myNewByteValue);

        // -32768 to 32767 (processing time = half of an int)
        short myShortValue = 30_000;
        short myNewShortValue = (short) (myShortValue/2);

        // -9_223_372_036_854_775_808L to 9_223_372_036_854_775_807L
        long myLongValue = 100L;

        byte byteValue = 62;
        short shortValue = 12_550;
        int intValue = 89_000;
        long longValue = 50_000 + 10 * (byteValue + shortValue + intValue);

        System.out.println(longValue);
    }
}
