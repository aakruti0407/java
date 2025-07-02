package com.basic;

import java.util.Scanner;

public class ladderif {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Roll No.");
		rno=sc.nextInt();
		System.out.println("Enter subject 1 marks");
		s1=sc.nextInt();
		System.out.println("Enter subject 2 marks");
		s2=sc.nextInt();
		System.out.println("Enter subject 3 marks");
		s3=sc.nextInt();
		
		
		total=s1+s2+s3;
		per=total/3;
		
		
		
		System.out.println("Name :" +name);
		System.out.println("Roll No :" +rno);
		System.out.println("Total :" +total);
		System.out.println("percentage :" +per);
		
		
		
		
		if(per>70)
		{
			System.out.println("Distiction");
		}
		
		else if(per>60)
		{
			System.out.println("First class");
		}
		else if(per>50)
		{
			System.out.println("Second class");
		}
		else if(per>40)
		{
			System.out.println("pass class");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
	}

}
