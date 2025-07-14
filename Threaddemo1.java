package com.thread;

class NewThread implements Runnable
{
	Thread t;
	public NewThread() {
		t=new Thread(this,"Child thread");
		t.start();
	}
public void run() {
	
} {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" :"+i);
				Thread.sleep(1000);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		System.out.println("Main Thread Existing");
		
	}
	
}

