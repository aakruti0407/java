package com.exception;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class Bank {
	public static void main(String[] args) {
		double amount;
		int choice;
		System.out.println("**************************************************************************");
		checkingaccount c=new checkingaccount(004,"Aakruti",1000);
		System.out.println("**************************************************************************");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("**************************************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. check deposit");
			System.out.println("4. Exit");
			System.out.println("**************************************************************************");
			
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			System.out.println("**************************************************************************");
			
			
			
			if (choice==1)
			{
				System.out.println("Enter Deposit Account");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("**************************************************************************");
				
			}
			else if(choice==2)
			{
				System.out.println("Enter Withdrawal Account");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);
					System.out.println("**************************************************************************");
					} catch(insufficiantfund e) {
						System.out.println("Sorry you need another"+e.getamount()+" Rs. To Withdraw");
						System.out.println("**************************************************************************");
					}
			}
			else if(choice==3)
			{
			     c.checkbalance();
			     System.out.println("**************************************************************************");
			}

			else if(choice==4)
				
			{
				System.out.println("Thankyou For using Our Services");
				System.out.println("**************************************************************************");
				break;
			}
			else 
			{
				System.out.println("Invalid Choice,Try Again.");
				System.out.println("**************************************************************************");
			}
				
				
						
					
				
				
			
		}
		
		
	}
}
