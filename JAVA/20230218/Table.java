package com.anandh20230218;


import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int num,i, sum;
System.out.println("Which Table You Want? ");
num=sc.nextInt();
for(i=1;i<=10;i++) {
	sum=i*num;
	System.out.println(num+" x "+i+" = " +sum);
}
}
}