package com.anandh;
import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Name;
		char check;
		int vc = 1;
		System.out.println("Enter String:");
		Name=input.nextLine().toLowerCase();
		for(int i=0;i<Name.length();i++) {
			check=Name.charAt(i);
			if(check==' ') {
			vc=vc+1;
			}
			}
		System.out.println("No of Words in the given Statement :"+vc);
	}

}