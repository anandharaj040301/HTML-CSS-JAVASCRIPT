package com.thread;
class MyClass extends Thread{
	public void run() {
	System.out.println("Calling run method");
	}
}

public class ThreadClass {
public static void main(String args[]) {
	System.out.println("JVM Thread"+Thread.currentThread());
	MyClass ob=new MyClass();
	ob.start();
}
}
