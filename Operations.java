package com.greatlearning.preworkassessment;

public class Operations {

	float num1;
	float num2;
	int sel;
	
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
}
