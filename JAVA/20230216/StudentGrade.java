package largestnumber;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks");
		marks=sc.nextInt();
		
		if(marks>=80 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=50 && marks<=79) {
			System.out.println("Grade B");
		}
		else if(marks>=30 && marks<=49) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=29) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
