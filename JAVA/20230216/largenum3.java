package largestnumber;

import java.util.Scanner;

public class largenum3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		num1=num.nextInt();
		System.out.println("Enter the Second Number:");
		num2=num.nextInt();
		System.out.println("Enter the Third Number:");
		num3=num.nextInt();
		
		int large=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
System.out.println("The Largest Number of "+num1+" , "+num2+" and " +num3+" is: " +large);

	}

}
