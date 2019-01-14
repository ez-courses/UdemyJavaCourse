package main;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.printf("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now: "+ result);
        result++;
        System.out.printf("Result is now: " + result);
        result -= 10;
        System.out.println("Result is now: " + result);
        result *= 10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien.");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score.");

        if (topScore != 100)
            System.out.println("You are not the high score.");

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than second top scrore and less than 100.");

        if ((topScore > 90) || (secondScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.printf("This is true.");

        boolean isCar = true;
        if (isCar == true)
            System.out.println("This is not suppose to happen.");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        // 1. Create a double variable with value 20
        // 2. Create a second variable with value 80
        // 3. Add both numbers and time 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 devided by 40
        // 5. Write an if statement that displays a message "Total was over the limit" if the remaining total (#4) is equal to 20 or less
        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        if(theRemainder <= 20)
            System.out.println("Total was over the limit.");
    }
}
