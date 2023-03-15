package com.anandh;

import java.util.HashMap;
import java.util.Map;


public class Hashmapfunc {

	public static void main(String[] args) {
		//creating an object
		Map<Long, String>student=new HashMap<Long, String>();
		student.put(9786430648l, "Anandraj");
		student.put(9886522522l, "Mani Shankar");
		student.put(9998855221l, "Rahul");
		student.put(9998855255l, "Gokul");
		student.put(999885221l, "Mohanakrishnan");
				System.out.println(student);
	}
}