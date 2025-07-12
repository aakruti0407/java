package com.exception;

public class insufficiantfund extends Exception{
	double amount;
	public insufficiantfund(double amount) {
		this.amount=amount;
	}
	public double getamount() {
		return this.amount;
		
	}
	

}
