package com.anandh;
import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Name;
		char check;
		int vc = 0;
		System.out.println("Enter String:");
		Name=input.nextLine().toLowerCase();
		for(int i=0;i<Name.length();i++) {
			check=Name.charAt(i);
			if(check=='a'||check=='e'||check=='i'||check=='o'||check=='u') {
			vc=vc+1;
			}
		}
		System.out.println("No of Vowels in the given String :"+vc);
	}

}