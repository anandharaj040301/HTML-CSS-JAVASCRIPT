package com.anandh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayList2 {

	public static void main(String[] args) {
		 
		   
			    List<Integer> numbers = new ArrayList<Integer>();
			    numbers.add(11);
			    numbers.add(12);
			    numbers.add(11);
			    numbers.add(14);
			    numbers.add(13);
			    numbers.add(15);
			    numbers.add(15);
			    System.out.println("ArrayList (before Adding) : " + numbers);
			    int pos;
				Integer ele;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the position : ");
				pos = sc.nextInt();
				System.out.println("Enter the Element : ");
				ele = sc.nextInt();
				numbers.add(pos, ele);
			    System.out.println("ArrayList (After Adding) :  " + numbers);
			    
	}
}

	
		

		

