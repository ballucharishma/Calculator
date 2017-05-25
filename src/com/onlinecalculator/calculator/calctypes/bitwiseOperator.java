package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class bitwiseOperator {
	int a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
	}
	void display(){
		System.out.println("a&b="+(a&b));
		System.out.println("a|b="+(a|b));
		System.out.println("(a^b)="+(a^b));
		System.out.println("a<<b="+(a<<b));
		System.out.println("a>>b="+(a>>b));
}
		
public static void main(String args[]){
	bitwiseOperator   s=new bitwiseOperator ();
	s.dynamicInput();
	s.display();
}
}
