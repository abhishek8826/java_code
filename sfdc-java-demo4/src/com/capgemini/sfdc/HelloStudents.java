package com.capgemini.sfdc;

public class HelloStudents {
		public static void PrintStudentDetails(int marks, int id) {
			System.out.println(marks);
			System.out.println(id);
		}
			
		public static void main(String[] args) {

			int marks,id;

			System.out.println("Abhishek info");
			marks = 90;
			id = 10;
			PrintStudentDetails(marks, id);

			System.out.println("Amit info");
			marks = 98;
			id = 11;
			PrintStudentDetails(marks, id);


	}

}
