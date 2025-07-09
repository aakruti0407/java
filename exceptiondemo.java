package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptiondemo {
	public static void main(String[] args) {
		System.out.println("start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter A :");
			a=sc.nextInt();
			System.out.println("Enter B :");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Divison :"+c);

		}catch(Exception e) {
			System.out.println("Exception Caught :"+e);
		}
		
		System.out.println("End Code");
	}

}
