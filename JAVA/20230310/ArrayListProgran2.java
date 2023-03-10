package com.anandh;

import java.util.ArrayList;

public class ArrayListProgran2 {
	 
    public static void main(String[] a){
         
        ArrayList<String> al = new ArrayList<String>();
        //add elements to the ArrayList
        al.add("JAVA");
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        System.out.println(al);
        //get elements by index
        System.out.println("Element at index 1: "+al.get(1));
        System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
        //add elements at a specific index
        al.add(2,"PLAY");
        System.out.println(al);
        System.out.println("Is arraylist empty? "+al.isEmpty());
        System.out.println("Index of PERL is "+al.indexOf("PERL"));
        System.out.println("Size of the arraylist is: "+al.size());
    }
}