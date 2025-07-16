package com.exception;

public class checkingaccount {
	int acno;
	String cname;
	double balance;
	public checkingaccount(int acno, String cname,double balance) {
		this.acno = acno;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Hello,"+cname+"\nyour account number,"+acno+" Is opened with "+balance+" Rs.");
		
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws insufficiantfund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			throw new insufficiantfund(amount-this.balance);
		}
	}
	public void  checkbalance()
	{
		System.out.println("Current balance : "+this.balance);
	}
}


