package com.anandh;

	abstract class abstract1{
		abstract void area();
	}
	class abstract2 extends abstract1{

		@Override
		void area() {
			System.out.println("square area");
			
		}

	}

	public class Abstract {

		public static void main(String[] args) {
			abstract2 sob=new abstract2();
			sob.area();
			}
	}
