
package com.capgemini.sfdc;

public class CalcDemo {
		public static void printnumber() { // method - no arguments and no return value- NANR
			System.out.println(10);
		}


		public static void printsum(int sum) { // method - with arguments and no return value- WANR

			System.out.println(10+20);
		}

		
		public static int return10() { // method - no arguments and with return value- NAWR
			return 10;
		}

		
		public static int returnsum(int sum) { // method - with arguments and with return value- WAWR

			return 10+20 ;
		}

		public static void main(String[] args) {
			System.out.println("main");
			printnumber();

			printsum(10+20);
	
			int output = return10();
			System.out.println(output);
			int output2 = returnsum(10+20); 
			System.out.println(output2);

		}


}
//class CalcDemo 
//
//
//
//public static methods - 
//
// 
//
//printNum - NANR - prints 10
//printSum - WANR - prints sum of two integers 
//returnNum - NAWR - returns 10
//returnSum - WAWR - returns sum of two integers 
//main method - invokes other methods 