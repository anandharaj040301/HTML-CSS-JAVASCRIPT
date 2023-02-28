package com.anandh1;

public class Staff {

		int Sid;
		String Sname;
		String Dep;
		public Staff(int Sid,String Sname,String Dep){
			this.Sid=Sid;
			this.Sname=Sname;
			this.Dep=Dep;
			}
		public void display() {
			System.out.println("Staff ID: "+Sid);
			System.out.println("Staff Name: "+Sname);
			System.out.println("Staff Department: "+Dep);
		}


		}