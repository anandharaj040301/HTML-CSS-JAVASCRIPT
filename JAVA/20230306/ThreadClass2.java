package com.thread1;

class MyClass extends Thread{
	public void run() {
		for (int i=0;i<=5;i++) {
	System.out.println("Calling run method" +Thread.currentThread());
	}
		}
}

public class ThreadClass2 {
public static void main(String args[]) {
	System.out.println("JVM Thread"+Thread.currentThread());
	MyClass ob=new MyClass();
	MyClass ob1=new MyClass();
	ob.setName("First");
	ob1.setName("Second");
	
	ob.start();
	ob1.start();
}
}