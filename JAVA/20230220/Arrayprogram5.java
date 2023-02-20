package com.anandh;
import java.util.Scanner;
public class Arrayprogram5 {

		public static void main(String[] args) {
			int a[]=new int[5],sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array Elements");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();  //accept array elements
			}

			System.out.println("Array Elements are");
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			System.out.println("Sum of All the arrays Elemets"+sum);
		}

	}