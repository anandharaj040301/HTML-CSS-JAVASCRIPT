package com.anandh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Hashmapfunc6 {
	
	private static void charcount(String word) {
	Map<Character,Integer> eachChar=new TreeMap<Character,Integer>();
		
	//split string to chara array
	char charr[]=word.toCharArray();
	//{'e','d','u','b','r','i','d','g','e'}
	
	for(char ch:charr) {
		if(eachChar.containsKey(ch)) {
			//already there
			
			eachChar.put(ch,eachChar.get(ch)+1);
			
		}else {
			eachChar.put(ch, 1);
		}
	}
	
	//display
	
	for(Map.Entry<Character, Integer> chd:eachChar.entrySet()) {
		System.out.println(chd.getKey()+"-->"+chd.getValue());
	}
	
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to find occurrance of each char");
		String word=sc.next(); //edubridge
		charcount(word);
	}

	

}