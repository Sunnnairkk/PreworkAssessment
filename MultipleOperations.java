
package com.greatlearning.preworkassessment;

//Sunil Kumar K K
//Prework Assessment - Multiple Operations
//01.08.2021

import java.util.Scanner;

public class MultipleOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sel;
		int num=0;
		
		Operations op = new Operations();
	
		do {
			
			System.out.println("Multiple Operations\n" +
					"1. Palindrome Number\n" +
					"2. Pattern of Stars\n" +
					"3. Prime Number\n" +
					"4. Fibonacci Series\n" +
					
					"\n0. Exit\n\n" +
					"Enter menu option\n");
			Scanner input = new Scanner(System.in);
			sel=input.nextInt();
			
			
			switch (sel) {
			case 1:
				System.out.println("Checking for Palindrone Number\n" +
						"Enter Number :");
				num=input.nextInt();
				if(num!=0) 
					op.palindrome(num);
				else
					System.out.println("0 Entered\n");
				break;
				
			case 2:
				System.out.println("Pattern of Stars\n" + 
						"Enter the Number of Stars : ");
				num=input.nextInt();
				if(num!=0) 
					op.patternOfStars(num);
				else
					System.out.println("0 entered\n");
				break;
				
			case 3:
				System.out.println("Enter a Number to check whether Prime :");
				num=input.nextInt();
				if (num!=0)
					op.checkPrimeNumber(num);
				else
					System.out.println("0 entered\n");
				break;
				
			case 4:
				System.out.println("Enter a Number to Display Fibanocci Series :");
				num=input.nextInt();
				if (num!=0) {
					System.out.print("0 1");
					Operations.fibonacciSeries(num-2);
					System.out.println("\n\n");
				} 
				else
					System.out.println("0\n");
				break;
				
			case 0:
				input.close();
				System.out.println("Execution Finished");
				break;
			default:
				System.out.println("Wrong Selection\n\n");
			}
			
		} while (sel != 0);
		
	}



}
