/**
 * 
 */
package Assignment_4_1;																						// Package declared
/**
 * 5) Joe is scared to go to school.When her dad asked the reason, joe said she is unable to complete the task given by her teacher. 
 * The task was to find the “first 10 multiples” of the number entered from stdin . 
 * Eg:
 * Input: 3
 * O/p:
 * 3 x 1 = 3
 * 3 x 2 = 6
 * .........
 * .........
 * .......
 * ....
 * 3 x 10 = 30
 * Help Joe in completing the task!
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
import java.util.Scanner;																					// scanner class is imported of take input form user
public class Task5 {																						// class Task5 declared
	public static Scanner s=new Scanner(System.in);															// new object is created to get the input from user	
	public static void main(String[] args) {																// main method started
		int joeIntegerInput,multiplyInteger;																// two integer declared
		System.out.print("Input : ");																		// print statement
		joeIntegerInput=s.nextInt();																		// integer input form user
		for(multiplyInteger=0;multiplyInteger<=10;multiplyInteger++){										// for loop with stating and ending condition
		System.out.println(joeIntegerInput+" X "+multiplyInteger+" = "+joeIntegerInput*multiplyInteger);}	// print statement
	}																										// main method closed		
}																											// class Task5 closed

