
package com.greatlearning.preworkassessment;

//Sunil Kumar K K
//Prework Assessment - Example for Multiple Operations
//01.08.2021

import java.util.Scanner;

public class MultipleOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sel;
		
		Operations op = new Operations();
	
		do {
			
			System.out.println("Multiple Operations Example");
			System.out.println("1. Addition");
			System.out.println("2. Substration");
			System.out.println("3. Multiplication");
			System.out.println("4. Divisioin");
			System.out.println("5. Remainder");
			System.out.println();
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("Select an option to continue");
			Scanner input = new Scanner(System.in);
			sel=input.nextInt();
			
			switch (sel) {
			case 1:
				System.out.println("Addition Operation");
				System.out.println("Enter First Number :");
				op.num1=input.nextFloat();
				System.out.println("Enter Second Number :");
				op.num2=input.nextFloat();
				System.out.println("Ans : " + op.addTwo());
				System.out.println();
				break;
			case 2:
				System.out.println("Substration Operation");
				System.out.println("Enter First Number :");
				op.num1=input.nextFloat();
				System.out.println("Enter Second Number :");
				op.num2=input.nextFloat();
				System.out.println("Ans : " + op.subTwo());
				System.out.println();
				break;
			case 3:
				System.out.println("Multiplication Operation");
				System.out.println("Enter First Number :");
				op.num1=input.nextFloat();
				System.out.println("Enter Second Number :");
				op.num2=input.nextFloat();
				System.out.println("Ans : " + op.mulTwo());
				System.out.println();
				break;
			case 4:
				System.out.println("Division Operation");
				System.out.println("Enter First Number :");
				op.num1=input.nextFloat();
				System.out.println("Enter Second Number :");
				op.num2=input.nextFloat();
				if(op.num2==0) {
					System.out.println("Division by 0 - ERROR");
					System.out.println();
				}
				else {
				System.out.println("Ans : " + op.divTwo());
				System.out.println();
				}
				break;
			case 5:
				System.out.println("Remainder");
				System.out.println("Enter First Number :");
				op.num1=input.nextFloat();
				System.out.println("Enter Second Number :");
				op.num2=input.nextFloat();
				System.out.println("Ans : " + op.modVal());
				System.out.println();
				break;
			case 0:
				System.out.println("Execution Finished");
				break;
			default:
				System.out.println("Wrong Selection");
				System.out.println();
			}
			
		} while (sel != 0);
	}

}
