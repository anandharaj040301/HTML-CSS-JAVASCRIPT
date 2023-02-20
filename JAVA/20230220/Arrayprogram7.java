package com.anandh;
import java.util.Scanner;

public class Arrayprogram7 {

	public static void main(String[] args) {
		int a[]=new int[5],sum=0, max;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		}

		System.out.println("Array Elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		max=(a[0]>a[1]&&a[0]>a[2]&&a[0]>a[3]&&a[0]>a[4])?a[0]:(a[1]>a[0]&&a[1]>a[2]&&a[1]>a[3]&&a[1]>a[4])?a[1]:(a[2]>a[0]&&a[2]>a[1]&&a[2]>a[3]&&a[2]>a[4])?a[2]:(a[3]>a[0]&&a[3]>a[2]&&a[3]>a[1]&&a[3]>a[4])?a[3]:a[4];
		System.out.println("Maximum value :" +max);
	}

}