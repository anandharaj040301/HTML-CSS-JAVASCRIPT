package com.anandh;
import java.util.Scanner;

public class Arrayprogram11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,1,3,4,5,7,6,10};
		int search;
		int pos=-1;
		search=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			  if(search==a[i]) {
				  pos=i;
				  break;
		}
		}
		if(pos>-1) {
			System.out.println("Search is Successful");
			System.out.println(search+" Present at position "+(pos+1));
		}
		else {
			System.out.println("Unsucessful Search");
			System.out.println(search+" Not Present  ");
		}
}
	}