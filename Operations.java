package com.greatlearning.preworkassessment;

public class Operations {

	private float num1;
	private float num2;
	private int num3;
	private String s="";
	
	public float getNum1() {
		return num1;
	}
	
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	
	public float getNum2() {
		return num2;
	}
	
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public float addTwo() {
		return  (num1 + num2);
	}
	
	public float subTwo() {
		return (num1 - num2);
	}
	
	public float mulTwo() {
		return (num1 * num2) ;
	}
	
	public float divTwo() {
		return (num1 / num2) ;
	}
	
	public float modVal() {
		return (num1%num2);
	}
	
	public void palindrome(int n) {
		
		int oNum = n;
		int rNum=0;
		int r;
		
		while(oNum!=0) {
			r = oNum % 10;
			rNum = rNum * 10 + r;
			oNum /= 10;
		}
		
		System.out.println();
		System.out.println("Reversed Number is : " + rNum);
		
		if(n == rNum) {
			System.out.println("Number is a Palindrome Number\n\n");
		}
		else {
			System.out.println("Number is Not a Palindrome Number\n\n");
		}
	}

	public void patternOfStars(int n) {
			//decreasing pattern
		
		for (int a=n; a>0; a--) {
			for (int b=1; b<=a; b++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public void checkPrimeNumber (int n) {
		
		boolean factors=false;
		
		for (int i=2;i<n;i++) {
			if(n%i==0) 
				factors=true;
			else
				factors=false;
			
			if(factors==true) break;
		}
		
		if (factors==true)
			System.out.println("The Number is NOT a Prime Number\n\n");
		else
			System.out.println("The Number is a Prime Number\n\n");
	}
	
	public static int a=0,b=1,c=0;
	
	public static void fibonacciSeries(int n) {
		if (n>0) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			fibonacciSeries(n-1);
		}
		else n=0;
	}
}
