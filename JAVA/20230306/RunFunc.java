package com.runable;
class myclass1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Run Method " +Thread.currentThread());
	}
	}
}
public class RunFunc {

	public static void main(String[] args) throws InterruptedException {
		myclass1 ob=new myclass1();
		Thread th1=new Thread(ob);
		myclass1 ob1=new myclass1();
		Thread th2=new Thread(ob1);
		th1.setName("first");
		th2.setName("Second");
		th1.start();
		th1.join();
		th2.start();
	}

}
