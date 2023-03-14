package com.anandh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
		 
		   
			    List<Integer> numbers = new ArrayList<Integer>();
			    numbers.add(11);
			    numbers.add(12);
			    numbers.add(11);
			    numbers.add(14);
			    numbers.add(13);
			    numbers.add(15);
			    numbers.add(15);
			    System.out.println("ArrayList with duplicate elements: " + numbers);
			    Set<Integer> set = new LinkedHashSet<>();
			    set.addAll(numbers);
			    //numbers.clear();
			   // numbers.addAll(set);
			   // System.out.println("ArrayList without duplicate elements: " + numbers);
			    
			    int c=0, el=11;
			    System.out.println("Does ArrayList have " +el+ ": " +numbers.contains(15));
			    for(int i:numbers) {
			    	if (i==el) {
			    		c++;
			    	}
			    }
			    System.out.println(el+" is present in " +c+" Times");
	}
}

	
		

	

