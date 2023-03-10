package com.anandh;

import java.util.ArrayList;

public class ArrayListProgran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			obj.add(i);
		}
obj.add(100);
obj.add(5,12);
System.out.println(obj);
obj.remove(5);
System.out.println(obj);
System.out.println("Array Size : " +obj.size());
System.out.println("12 is Available or Not: "+obj.contains(12) );

	}

}
