package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class ifelseif {
	int a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
	}
	void display(){
		if(a<b)
			System.out.println("a is big");
		else
			System.out.println("b is big");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelseif s=new ifelseif();
		s.dynamicInput();
		s.display();
		

	}

}
