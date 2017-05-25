package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
class mno2{

static int x;
void display(){

           Scanner sc=new Scanner(System.in);
		System.out.println("enter the variable");
		x=sc.nextInt();
		System.out.println("class variable x="+x);
	}
}

public class classvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mno2 s=new mno2();
		
		s.display();

	}

}
