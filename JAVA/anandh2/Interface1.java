package com.anandh2;



	interface BankInterface{
		double inamount=10000; //public static final inamount=10000;
		void deposit(double amt); //public abstract void deposit()
		void withdraw(double amt);//public abstract void withdraw
		
	}
	class MyBank implements BankInterface{
	  double bankbal;
		@Override
		public void deposit(double amt) {
			bankbal=inamount+amt;
			System.out.println("Bank balance="+bankbal);
			
		}

		@Override
		public void withdraw(double amt) {
			bankbal=bankbal-amt;
			System.out.println("After withdraw bank balance="+bankbal);
			
		}
	}
	public class Interface1 {

		public static void main(String[] args) {
			MyBank bob=new MyBank();
			bob.deposit(20000);
			bob.withdraw(1000);

		}

	}