package com.anandh20230218;


import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}