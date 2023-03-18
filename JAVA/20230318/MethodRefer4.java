package com.anandh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class MethodRefer4 {

	
	public static void main(String[] args) {
		
		List<String> course=List.of("JAVA","j2ee","Spring","Hibenate");
		course.stream()
		.map(x->x.toUpperCase())
		.forEach(System.out::println);
		course.stream()
		.map(x->x.toLowerCase())
		.forEach(System.out::println);
		course.stream()
		.map(x->x+":"+x.length())
		.forEach(System.out::println);
		
		String str="Capgemini";
		List<String> list=new ArrayList<String>();
		String s[]=str.split("");
		List<String> st=Arrays.asList(s);
		 System.out.println(st);

		 st.stream()
		 .map(x->x+" ")
		 .forEach(System.out::print);
				
		
		}

}	