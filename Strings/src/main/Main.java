package main;

public class Main {

    public static void main(String[] args) {
        // Primitive Types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is : " + myString);
        myString = myString + ", and this more.";
        System.out.println("myString is now: " + myString);
        myString += "\u00A9 2015";
        System.out.println("and now: " + myString);

        String numberString = "250.45";
        numberString = numberString + "49.95";
        System.out.println("The result is : " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is: " + lastString);

    }
}
