package main;

public class Main {

    public static void main(String[] args) {
    	// width = 32, 4 bytes
	    int myIntValue = 5 / 3;
	    // width = 32
	    float myFloatValue = 5f / 3f;
	    // width 64, 8 bytyes
	    double myDoubleValue = 5d / 3d;
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);


		// Convert a given number of pounds to kilograms
		// 1. Create a variable to store the number of pounds
		// 2. Calculate the number of Kilograms for the number above and store in a variable.
		// 3. Print out the result
		// Notes: 1 pound is equal to 0.45359237 kilograms
		double numPounds = 200d;
		double convertedKilograms = numPounds * 0.45359237d;
		System.out.printf("Kilograms = " + convertedKilograms);

		double pi = 3.141_592_7d;
    }
}
