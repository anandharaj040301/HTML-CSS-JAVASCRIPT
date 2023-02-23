package com.anandh;

import java.util.Scanner;

public class MovieMagic {
 int year;
 String title;
 float rating;
  MovieMagic(){
	  year=0;
	  title="";
	  rating=0;
	  			  
  }
  
  void accept() {
	  Scanner myObj=new Scanner(System.in);
	  System.out.println("Enter the Movie name: ");
	  title=myObj.nextLine();
	  System.out.println("Enter the Year of Release of the Movie: ");
	  year=myObj.nextInt();
	  System.out.println("Enter the Movie Rating: ");
	  rating=myObj.nextFloat();
  }
  
  void rating() {
	  if(rating<=2.0) {
		  System.out.println(title+": Movie is Flop");
	  }
	  
	  else if(rating>=2.1 && rating<=3.4) {
		  System.out.println(title+": Movie is Semi-hit");
	  }
	  
	  else if(rating>=3.5 && rating<=4.5) {
		  System.out.println(title+": Movie is Hit");
	  }
	  
	  else if(rating>=4.6 && rating<=5.0) {
		  System.out.println(title+": Movie is Super Hit");
	  }
  }
	public static void main(String[] args) {
		MovieMagic obj=new MovieMagic();
		obj.accept();
		obj.rating();

	}

}
