package com.thread;


public class threaddemo {
	public static void main(String[] args) {
		new NewThread();
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(8);
		System.out.println(t);
		try {
			
		} catch (Exception e) {
			
		}
		
	}

}
