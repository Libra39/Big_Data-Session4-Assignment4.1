/**
 * 
 */
package Assignment_4_1;																								// Package declared
/**
 * 7) Can you overload a method with same return type.? Explain your answer with proper logic.
 * 
 * The compiler does not consider return type when differentiating methods, 
 * so you cannot declare two methods with the same signature even if they have a different return type. 
 * if the number of parameters and their types is same but order is different then it is possible since it results in method overloading
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */

import java.io.BufferedReader;																						// Java BufferedReader class is used to read the text from a character-based input stream
import java.io.InputStreamReader;																					// InputStreamReader class is a bridge from byte streams to character streams.It reads bytes and decodes them into characters using a specified charset.
public class Task7 {																								// class Task 7 declared
	public static void main(String[] args) {																 		// main method declared
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);    							 		// system.in reader (e.g. the input from the console)  
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);           					 		// buffer the console reader          
        int myDefaultNumber1 = 0;																			 		// the default values for the three numbers
        int myDefaultNumber2 = 0;
        int myDefaultNumber3 = 0;
        System.out.print("\nThe compiler does not consider return type, when methods overloading"+								// Print statement
					"\nso you cannot declare two methods with the same signature even if they have a different return type"+
					"\n\nExample is given below :-\n");	
        try {																								 		// try block started 
            System.out.print("First number is  : ");													     		// print statement
            myDefaultNumber1 = Integer.parseInt(bufferedReader.readLine());								 			// read in the console input one line (bufferedReader.readLine) and then convert to a integer
            System.out.print("Second number is : ");														 		// print statement
            myDefaultNumber2 = Integer.parseInt(bufferedReader.readLine());								 			// read in the console input one line (bufferedReader.readLine) and then convert to a integer
            System.out.print("Thrid number is  : ");												 			// print statement
            myDefaultNumber3 = Integer.parseInt(bufferedReader.readLine());								 			// read in the console input one line (bufferedReader.readLine) and then convert to a integer
    	}																									 		// try blocked closed
        catch (Exception ex){
        System.out.println(ex.toString());}																			// if the input was a string.
	    System.out.println("Sum of Two Integers   : " + sum(myDefaultNumber1, myDefaultNumber2));			        // output the answer of adding two of the values together
	    System.out.println("Sum of Three Integers : " + sum(myDefaultNumber1, myDefaultNumber2,myDefaultNumber3));	// output the answer of adding three of the values together
	    System.out.print("\nThe reason is that overloads in Java are only allowed for methods with different signatures. "
				+ "\nThe return type is not part of the method signature, hence cannot be used to distinguish overloads. ... "
				+ "\nReturn type does not matter while overloading a method. We just need to ensure there is no ambiguity!");
	}
	static int sum(int myfirstInteger, int mySecondInteger){														// two parameterized sum() method	
        return (myfirstInteger+mySecondInteger);}														 			// if true then add myfirstInteger and mySecondInteger
	static double sum(int myfirstInteger, int mySecondInteger, int mythirdInteger){									// method overloading with three parameterized sum() method
        return (myfirstInteger+mySecondInteger+mythirdInteger);}													// if true then add myfirstInteger, mySecondInteger, myThirdInteger
}																													// class Task7 closed
