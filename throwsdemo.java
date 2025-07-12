package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwsdemo {
	public static void demo() throws ArithmeticException,InputMismatchException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter X");
		x=sc.nextInt();
		if(x>0)
		{
			System.out.println("Square of"+" Is" +(x*x));
		}
		else
		{
			throw new  ArithmeticException();
		}
		
	}

}
