package com.anandh20230218;


import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f1,f2,f3,terms;
		f1=1;
		f2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		terms=sc.nextInt();
		System.out.println("Fibonacci Series");
		System.out.println(f1); //1
		System.out.println(f2);  //1
		
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
			System.out.println(f3); //2 3 5
			f1=f2; //f1=1
			f2=f3;//f2=2
			
		}
		
	}

}