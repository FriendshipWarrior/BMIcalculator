/*
	Dustin Hurst
	CS 3250
	Assignment 1
*/

import java.util.Scanner;
import java.lang.Math;

public class BMI{
	public static void main(String[] args){
		double weight = 1;
		double height = 1;

		/* Get input about user's weight */
		Scanner w = new Scanner(System.in);
		do{
			if(weight <=0){
				System.out.println("Error That input is invalid");
				System.out.println();
			}
			System.out.println("How much do you weigh (in pounds)?");
			while(!w.hasNextDouble()){ /* Error check for invalid input */
				if(w.hasNext("quit")) /* If user enters "quit" program will terminate */
					System.exit(0);
				w.next();
				System.out.println();
				System.out.println("Error: That input is invalid");
				System.out.println();
				System.out.println("How much do you weigh (in pounds)?");
			}
			weight = w.nextDouble();
		}while(weight <=0); /* Error check for invalid numeric input */

		/* Get input about user's height */
		Scanner h = new Scanner(System.in);
		do{
			if(height <=0){
				System.out.println("Error: That input is invalid");
				System.out.println();
			}
			System.out.println("How tall are you (in feet)?");
			while(!h.hasNextDouble()){ /* Error check for invalid input */
				if(h.hasNext("quit"))
					System.exit(0); /* If user enters "quit" program will terminate */
				h.next();
				System.out.println();
				System.out.println("Error: That input is invalid");
				System.out.println();
				System.out.println("How tall are you (in feet)?");
			}
			height = h.nextDouble();
		}while(height <= 0); /* Error check for invalid numeric input */

		height = height * 12; /* Convert to inches ( 1 foot, 12 inches) */
		
		/* Calculate BMI */
		double BMI = (weight * 703) / Math.pow(height, 2);

		System.out.print("Your BMI is: " + String.format("%.2f", BMI)); /* Rounds to two decimal places */
		
		/* If-else statement to determine weight class */
		if (BMI < 18.5)
			System.out.println(", underweight");
		else if (BMI < 24.99)
			System.out.println(", normal");
		else if (BMI < 29.99)
			System.out.println(", overweight");
		else if (BMI < 34.99)
			System.out.println(", obesity(class 1)");
		else if (BMI < 39.99)
			System.out.println(", obesity(class 2)");
		else
			System.out.println(", morbid obesity");
	}	
}

