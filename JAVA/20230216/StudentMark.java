package largestnumber;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
			char Grade;
			System.out.println("Available Grades: \t A \t B \t C \tF");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student Grade:");
			Grade=sc.next().charAt(0);
			System.out.println("Grade: "+Grade);
			
			if(Grade=='A') {
				System.out.println("Your grade Is A. So,Your Mark Is: 80 to 100");
			}
			else if(Grade=='B') {
				System.out.println("Your grade Is B. So,Your Mark Is: 50 to 79");
			}
			else if(Grade=='C') {
				System.out.println("Your grade Is B. So,Your Mark Is: 30 to 49");
			}
			
			else if(Grade=='F') {
				System.out.println("Your grade Is B. So,Your Mark Is: 0 to 29 and You are Fail");
			}
			else {
				System.out.println("Invalid Input");
			}

	}

}
