package com.anandh20230218;


import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		int num, digit, rev=0,copynum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt(); //123   o/p 321
		copynum=num;
		while(num!=0) {  //num=123    num=12 num=1
			digit=num%10;  //3  //2  1
			//System.out.print(digit); //321
			rev=rev*10+digit;  //rev=0*10+3= rev=0+3=3     rev=3*10+2=32   rev=32*10+digit=320+1=321
			num=num/10; //num=12  num=1  num=0
			
		}
		System.out.println("Reverse  number is "+rev);
		//System.out.println("Given number="+num);
		
		if(rev==copynum) {
			System.out.println("Given number is Pallandrome");
		}else {
			System.out.println("Given number is not a pallandrome");
		}
	}

}