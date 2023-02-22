package com.anandh;

class Addition{
	
	void add(int i, int j) {
		int sum;
		sum=i+j;
		System.out.println("Sum of two integer values="+sum);
	}
	void add(float i, float j) {
		float sum;
		sum=i+j;
		System.out.println("Sum of two float values="+sum);
	}
	void add(double i, double j) {
		double sum;
		sum=i+j;
		System.out.println("Sum of two double values="+sum);
	}
}

public class FunctionOverloading {

	public static void main(String[] args) {
		Addition aob=new Addition();

		aob.add(8, 6);
		aob.add(5.6f, 2.3f);
		aob.add(45.3, 23.2);
	}

}