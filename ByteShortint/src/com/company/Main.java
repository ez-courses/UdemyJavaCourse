package com.company;

import javax.security.sasl.SaslServer;

public class Main {

    public static void main(String[] args) {
        // int width 32
        int myMinValue = -2147_483_648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte width 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByte: " + myNewByteValue);

        // short width 16
        short myShortValue = -32768;
        // long width 54
        long myLongValue = 100L;


        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);





    }
}
