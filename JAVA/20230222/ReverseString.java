package com.anandh;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Name,revstr="";
		char check;
		System.out.println("Enter String:");
		Name=input.nextLine();
		for(int i=0;i<Name.length();i++) {
			check=Name.charAt(i);
			revstr=check+revstr;
			}
			
		System.out.println("Reverse String :"+revstr);
	}

}