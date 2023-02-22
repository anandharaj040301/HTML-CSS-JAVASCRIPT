package com.anandh;
import java.util.Scanner;
public class ReverseString2 {

	public static void main(String[] args) {
		String s;char ch;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
			}
			
		}

