/**
 * 
 */
package Assignment_4_1;																						// Package declared
/**
 * 3) Write a program with method name sum() that accepts two parameters from user and 
 * print the sum of two numbers. Output format should be as:
 * First number is: 
 * Second number is:
 * Sum is: 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
import java.io.BufferedReader;																				 // Java BufferedReader class is used to read the text from a character-based input stream							
import java.io.InputStreamReader;																			 // InputStreamReader class is a bridge from byte streams to character streams.It reads bytes and decodes them into characters using a specified charset.
public class Task3 {																						 // class Task3 declared	
	public static void main(String[] args) {																 // main method declared
		System.out.println("\nThe program with two integers inputs taken from user and print there sum using method name sum()\n");  // print statement
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);    							 // system.in reader (e.g. the input from the console)  
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);           					 // buffer the console reader          
        int myDefaultNumber1 = 0;																			 // the default values for the two numbers
        int myDefaultNumber2 = 0;
        try {																								 // try block started 
               System.out.print("First number is  : ");													     // print statement
               myDefaultNumber1 = Integer.parseInt(bufferedReader.readLine());								 // read in the console input one line (bufferedReader.readLine) and then convert to a integer
               System.out.print("Second number is : ");														 // print statement
               myDefaultNumber2 = Integer.parseInt(bufferedReader.readLine());								 // read in the console input one line (bufferedReader.readLine) and then convert to a integer
        	}																								 // try block closed	
        catch (Exception ex){																				 // catch statement
               System.out.println(ex.toString());}															 // if the input was a string.
         	   System.out.println("Sum is           : " + sum(myDefaultNumber1, myDefaultNumber2));			 // output the answer of adding both of the values together
	}																										 // main method closed
	private static int sum(int myfirstInteger, int mySecondInteger){										 // two parameterized sum() method	
           return (myfirstInteger+mySecondInteger);}														 // if true then add myfirstInteger and mySecondInteger
}																											 // class Task3 
