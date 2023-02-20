package com.anandh;
import java.util.Scanner;

public class Arrayprogram9 {

	public static void main(String[] args) {
		int a[]=new int[5],sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		}

		System.out.println("Array Elements are");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+",");
		}
		
				
	}
}