package largestnumber;
import java.util.Scanner;
public class larnum {

	public static void main(String[] args) {
		int num1,num2;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		num1=num.nextInt();
		System.out.println("Enter the Second Number:");
		num2=num.nextInt();
		/*if(num1>num2) {
			System.out.println("The Largest Number of "+num1+" and "+num2+" is: " +num1);
		}
		else {
			System.out.println("The Largest Number of "+num1+" and "+num2+" is: " +num2);
		}*/
		int large=(num1>num2)?num1:num2;
System.out.println("The Largest Number of "+num1+" and "+num2+" is: " +large);
}
}
