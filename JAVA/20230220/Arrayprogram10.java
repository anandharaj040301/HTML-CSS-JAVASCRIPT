package com.anandh;
import java.util.Scanner;

public class Arrayprogram10 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		}

		System.out.println("Array values of a:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array values of b:");
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		
				
	}
}
	}