package com.anandh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayListReverse {
	 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}
