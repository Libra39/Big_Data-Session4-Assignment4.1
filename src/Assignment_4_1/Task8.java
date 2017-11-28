/**
 * 
 */
package Assignment_4_1;																									// Package declared
/**
 * 8) Write a program in java using Arrays, that sorts the element in descending order.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
import java.util.Scanner;																								// scanner class is imported of take input form user
public class Task8 {																									// class Task 8 declared
	public static Scanner scanner = new Scanner(System.in);																// new object is created to get the input from user	
	public static void main(String[] args) {																			// main method started
        int numberOfElements, temp;																						// two integer initiated
        System.out.print("Enter Number of elements you want in array : ");												// print statement
        numberOfElements = scanner.nextInt();																			// integer input from user
        int a[] = new int[numberOfElements];																			// new array object declared
        System.out.println("Enter all the elements : ");																// print statement
        for (int myInteger = 0; myInteger < numberOfElements; myInteger++) {											// for loop with condition starting with 0 and ending when myInteger less than numberOfElements 
            a[myInteger] = scanner.nextInt();}																			// integer input from user
        for (int myInteger = 0; myInteger < numberOfElements; myInteger++) {											// for loop with condition starting with 0 and ending when myInteger less than numberOfElements 
        	for (int myNextInteger = myInteger + 1; myNextInteger < numberOfElements; myNextInteger++) {				// nested for loop 
        		if (a[myInteger] < a[myNextInteger]) {																	// if statement
                    temp = a[myInteger];
                    a[myInteger] = a[myNextInteger];
                    a[myNextInteger] = temp;}
            }																											// nested for loop closed
        }																												// for loop closed
        System.out.print("\nDescending Order:");																		// print statement
        for (int myInteger = 0; myInteger < numberOfElements - 1; myInteger++) {										// for loop
            System.out.print(a[myInteger] + ",");
        }
        System.out.print(a[numberOfElements - 1]);																		// if not true then numberOfElements - 1
	}																													// main method closed
}																														// class Task8 closed	
