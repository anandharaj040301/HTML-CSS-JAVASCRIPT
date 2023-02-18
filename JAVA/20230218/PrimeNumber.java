package com.anandh20230218;


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		int i, count = 0;
		System.out.println("The factors of " + num + " are :");
		for(i = 1; i <= num; i++)
		{
		if(num % i == 0)
		{
		count = count + 1;
		System.out.println(i+" ");
		}
		}
		
		if(count==2) {
		System.out.println("Total Number of factor is " +count+" So "+num+ " is a Prime number" );
	}
		else{
			System.out.println("Total Number of factor is " +count+" So "+num+ " is Not a Prime number" );
		}
		}
}
	