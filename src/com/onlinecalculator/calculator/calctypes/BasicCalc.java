package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

class Calc1
{
	int a,b,c,ch,res;
	public Calc1()
	{
		a=0;
		b=0;
		c=0;
		res=0;
        
		}
	
	public int menu()
        {
		System.out.println("select option");
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
	    System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
	  ch=s.nextInt();
	  return 0;
	  
}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the first number");
    	a=s.nextInt();
    	System.out.println("enter the second number");
    	b=s.nextInt();
    	 }

    public void performOperation()
{
    	switch(ch)
    	{
case 1:System.out.println("add");
res=add();
System.out.println(res);
break;
case 2:System.out.println("subtract");
res=subtract();
System.out.println(res);
break;
case 3:System.out.println("multiply");
res=multiply();
System.out.println(res);
break;
case 4:System.out.println("divide");
res=divide();
System.out.println(res);
break;
default:System.out.println("Invalid choice");	
        }
    
       
    }
    
	int add()
	{
		c=a+b;
		return c;
		}
	
	int subtract()
	{
		c=a-b;
		return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
		}
	
}
public class BasicCalc
{
	public static void main(String args[])
	{
		Calc1 c=new Calc1();
		c.menu();
		c.userInputs();
		c.performOperation();
		}
	
	}