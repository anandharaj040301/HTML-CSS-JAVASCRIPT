package com.anandh;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListClone {
	 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Forth");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Cloned ArrayList:"+copy);
    }
}
