package com.demo;

public class StudentsDetail implements Runnable {
	Students1 s=new Students1();

	@Override
	public void run() {
		
		for(int i=1;i<5;i++) {
			withdraw(500);
			if(s.getBalance()<=0) {
				System.out.println("Stop Process");
			}
		}
	}
	
	
	public synchronized  void withdraw(int amt) {
		if(s.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+"Thread is Running");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  int bal=s.getWithdraw(amt);
	  System.out.println(Thread.currentThread().getName()+"Thread is Completed"+bal);
	}

}
