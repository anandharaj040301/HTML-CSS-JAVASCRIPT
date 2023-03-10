package com.anandh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayListNewCollection {
	 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
    }
}