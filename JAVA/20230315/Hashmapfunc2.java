package com.anandh;

import java.util.HashMap;
import java.util.Map;


public class Hashmapfunc2 {

	public static void main(String[] args) {
		//creating an object
		Map<Integer, String>student=new HashMap<Integer, String>();
		student.put(1111, "Anandraj");
		student.put(1112, "Mani Shankar");
		student.put(1113, "Rahul");
		student.put(1114, "uma");
		student.put(1117, "Anandraj");
		System.out.println(student);
	}
}