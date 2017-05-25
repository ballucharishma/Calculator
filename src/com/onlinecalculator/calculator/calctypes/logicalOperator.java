package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class logicalOperator {
	Boolean a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextBoolean();
		System.out.println("enter the second number");
		b=sc.nextBoolean();
	}
	void display(){
		System.out.println("a&&b="+(a&&b));
		System.out.println("a||b="+(a||b));
		System.out.println("!(a&&b)="+!(a&&b));
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logicalOperator  s=new logicalOperator();
		s.dynamicInput();
		s.display();
		

	}

}
