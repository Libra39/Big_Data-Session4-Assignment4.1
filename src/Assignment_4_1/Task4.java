/**
 * 
 */
package Assignment_4_1;												// Package declared
/**
 * 4) Write a program to accepts two numbers from stdin and find all the odd as well as even numbers present in between them.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
import java.util.Scanner;											// scanner class is imported of take input form user
public class Task4 {												// class Task4 declared
	public static Scanner scanner=new Scanner(System.in);			// new object is created to get the input from user	
	public static void main(String[] args) {						// main method started
		int startInteger,endInteger;								// two integers variable declared
		System.out.print("Enter first number  : ");					// print statement
		startInteger=scanner.nextInt();								// integer input form user
		System.out.print("Enter second number : ");					// print statement
		endInteger=scanner.nextInt();								// integer input from user
		System.out.print("Odd numbers         : ");					// print statement
			for(int i=startInteger; i <= endInteger; i++){			// for loop with stating and ending condition
				if( i % 2 != 0){									// if the number is divisible by 2 then it is even
                    System.out.print(i + " ");}
			}														// for loop closed	
        System.out.print("\nEven numbers        : ");				// print statement
        	for(int i=startInteger; i <= endInteger; i++){			// for loop with stating and ending condition
        		if( i % 2 == 0){  									// if the number is divisible by 2 then it is even
                    System.out.print(i + " ");}
        	}														// for loop closed
	}																// main method closed
}																	// class Task4 closed
