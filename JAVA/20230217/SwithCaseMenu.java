package com.anandh;
import java.util.Scanner;
class Menu{
	Scanner myObj = new Scanner(System.in);
	public void Rectangle() {
		System.out.println("---Area Of Rectangle---");
    	float Rec_answer;
    	System.out.println("Enter the Length:");
    	float Rec_length = myObj.nextFloat();
    	System.out.println("Enter the Width:");
    	float Rec_width = myObj.nextFloat();
    	Rec_answer=Rec_length*Rec_width;
    	System.out.println("The Area Of Rectangle : "+Rec_answer);
    	
	}
	public void Square() {
		System.out.println("---Area Of Square---");
    	float Squ_answer;
    	System.out.println("Enter the Value:");
    	float Squ_Value = myObj.nextFloat();
    	Squ_answer=Squ_Value*Squ_Value;
    	System.out.println("The Area Of Square : "+Squ_answer);
	}
	public void Triangle() {
		System.out.println("---Area Of Triangle---");
    	float Tri_answer;
    	System.out.println("Enter the base:");
    	float Tri_base = myObj.nextFloat();
    	System.out.println("Enter the height:");
    	float Tri_height = myObj.nextFloat();
    	Tri_answer=(Tri_base*Tri_height)/2;
    	System.out.println("The Area Of Triangle : "+Tri_answer);
		
	}
	public void Circle() {
		System.out.println("---Area Of Circle---");
    	float Cir_answer;
    	System.out.println("Enter the Length:");
    	float Cir_radius = myObj.nextFloat();
    	Cir_answer=3.14159f*Cir_radius*Cir_radius;
    	System.out.println("The Area Of Circle : "+Cir_answer);
		
	}
	
}
public class SwithCaseMenu{

	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Area Of Rectangle Enter 1");
		System.out.println("Area Of Square Enter 2");
		System.out.println("Area Of Triangle Enter 3");
		System.out.println("Area Of Circle Enter 4");
		System.out.println("---------------------------------");
		System.out.println("Enter Your Choice:");
	    int a = myObj.nextInt();
	    Menu read=new Menu();
	    switch(a){
	    case 1:
	    	read.Rectangle();
	    		    	break;
	    case 2:
	    	read.Square();
	    	break;
	    case 3:
	    	read.Triangle();
	    	break;
	    case 4:
	    	read.Circle();
	    	break;
	    
	    	default:
	    		System.out.println("Enter the Correct Choice");
	    		break;
	        
	         	  
			 }

		}

	}

