package com.anandh3;

interface BankInterface{
	double inamount=10000; //public static final inamount=10000;
	void deposit(double amt); //public abstract void deposit()
	void withdraw(double amt);//public abstract void withdraw
	
}
 abstract class MyBank implements BankInterface{
  double bankbal;
	@Override
	public void deposit(double amt) {
		bankbal=inamount+amt;
		System.out.println("Bank balance="+bankbal);
		
	}
 }
 
 //one more level that is by extending abstract class
 class MyBank1 extends MyBank{

	@Override
	public void withdraw(double amt) {
		bankbal=bankbal-amt;
		System.out.println("Balance ="+bankbal);
		
	}
	 
 }
 
public class Interface2 {

	public static void main(String[] args) {
	  MyBank1 bob=new MyBank1();
		bob.deposit(20000);
		bob.withdraw(1000);

	}

}