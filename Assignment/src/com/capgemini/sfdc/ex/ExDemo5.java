package com.capgemini.sfdc.ex;

import java.util.Scanner;

class Employee {

	 int Eid1, Eid2;
	 String firstName;
	 double salary;
}

public class ExDemo5 {
	
		public static void CheckEmployeeId(int Eid1, int Eid2) {
			if(Eid1 == Eid2){
				throw new InvalidEmployeeException("Invalid Employee");
			}
			else {
				System.out.println("Valid Employee");
			}
		}
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid1 :");
		int EID1 = sc.nextInt();
		System.out.println("Enter Eid2 :");
		int EID2 = sc.nextInt();

		Employee newEmp = new Employee();
		try {
			ExDemo5.CheckEmployeeId(newEmp.Eid1,newEmp.Eid2);
		}
		catch (InvalidEmployeeException IEE) {
			System.out.println(IEE.getMessage());
		}
		}
}

	