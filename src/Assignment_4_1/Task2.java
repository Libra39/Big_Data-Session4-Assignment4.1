/**
 * 
 */
package Assignment_4_1;																							// Package declared
/**
 * 2) Rewrite the above code, where, inputs are provided by the user at runtime and the output is printed.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
import java.util.Scanner;																						// scanner class is imported of take input form user
public class Task2 {																							// class Task2 declared
	public static Scanner in = new Scanner(System.in);															// new object is created to get the input from user		
		public static void main(String[] args) {																// main method started
			System.out.println("\nThe program with two integers inputs taken from user and print there sum\n"); // print statement
			int myfirstInteger, mySecondInteger, sum;															// three integer initiated
			System.out.print("Enter the First number  : ");														// print statement
			myfirstInteger = in.nextInt();																		// integer input from user
			System.out.print("Enter the Second number : ");														// print statement	
			mySecondInteger = in.nextInt();																		// integer input from user	
			sum = myfirstInteger + mySecondInteger;																// sum integer stores the value of addition of myfirstInteger and mySecondInteger Integer
			System.out.println("Sum is                  : "+sum);													// print statement
		}																										// main method closed
}																												// class Task2 closed
