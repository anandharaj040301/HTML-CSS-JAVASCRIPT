package com.anandh20230218;


import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int num, print;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		print = sc.nextInt();
		int j,i,n = 0;
		int count=0;
		
		System.out.println("The Prime Numbers between : "+print);
		for(j=1;j<=print;j++) {
			count = 0;
				for( i = 1; i <= j; i++)	{
		if(j % i == 0){
		count = count + 1;
				}
		}
		if(count==2) {
			n++;
		System.out.println(j);
}
		
}
		System.out.println("Total number of prime numbers between 1 to " +print+" : " +n);
}
}