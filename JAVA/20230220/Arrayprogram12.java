package com.anandh;
import java.util.Scanner;

public class Arrayprogram12 {

	public static void main(String[] args) {
		int a[], size; //declare
		int search_element,pos=-1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to search in an array");
		  search_element=sc.nextInt();
		  
		//Linearch Search
		  
		 for(int i=0;i<a.length;i++) {
			 if(search_element==a[i]) {
				 pos=i;
				 break;
			 }
		 }
		 if(pos>-1) {
			 System.out.println("Successful search");
			 System.out.println(search_element+" present at position "+(pos+1));
		 }else {
			 System.out.println("Unsuccessful search");
			 System.out.println(search_element+" not present");
		 }
	}
}
