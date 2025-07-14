package com.thread;

class NewThread1 extends Thread
{
	public NewThread1() {
		super("Child thread");
		start();
	}
public void run() {
	
} {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(this+" :"+i);
				Thread.sleep(1000);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		System.out.println("Main Thread Existing");
		
	}
	
}
public class Threaddemo3 {
	public static void main(String[] args) {
		new NewThread1();
		new NewThread1();
		new NewThread1();
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(7);
		System.out.println(t);
		try {
			for(int i=0;i<5;i++);
			{
				System.out.println(t+" :"+t);
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		System.out.println("Main Thread Existing");
		
	}

}







	