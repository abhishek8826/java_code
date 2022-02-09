package com.capgemi.sfdc.day2;

import java.util.Scanner;

public class AccessDemo {
	

//		static void methodInOtherClass() {
//			System.out.println(AccessClass.publicField);
//			System.out.println(AccessClass.protectedField);
//			System.out.println(AccessClass.packageField);
//			System.out.println(AccessClass.privateField);
//		}
//
//	}
	int eid, eid2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid:");
		int eid = sc.nextInt();
		System.out.println("Enter eid2:");
		int eid2 = sc.nextInt();
		System.out.println(eid+eid2);
	}
}
package com.capgemini.sfdc.ex;

import java.util.Scanner;

class Employee {

	 int arrEid[];
	 int eid;
	 String firstName;
	 double salary;
}

//public class ExDemo5 {
//	
//		public static void CheckEmployeeId(int arrEid[], int eid) {
//			for(int i=0;i<=5;i++)
//			{
//			if(eid != arrEid[i]){
//				throw new InvalidEmployeeException("Invalid Employee");
//			}
//			if(eid == arrEid[i]) {
//				System.out.println("Valid Employee");
//			}
//		}
//	}
//	
//		public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter eid :");
//		int eid = sc.nextInt();
////		System.out.println("Enter Eid2 :");
////		int EID2 = sc.nextInt();
//		int [] arrEid = new int[5];
//		
//		System.out.println("Enter array elements :");
//		for(int k = 0;k<=5;k++) {
//			 arrEid[k] = sc.nextInt();
//		}
//
//		Employee newEmp = new Employee();
//		try {
//			ExDemo5.CheckEmployeeId(newEmp.arrEid,newEmp.eid);
//		}
//		catch (InvalidEmployeeException IEE) {
//			System.out.println(IEE.getMessage());
//		}
//		}
//}
//
//	