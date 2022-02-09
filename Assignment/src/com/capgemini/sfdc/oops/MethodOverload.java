package com.capgemini.sfdc.oops;


	

	class Calc {

		static void addNums(int i, int j) {
			System.out.println(i + j);
		}

		static void addNums(int i, int j, int k) {
			System.out.println(i + j + k);
		}

		static void addNums(int i, int j, int k, int l) {
			System.out.println(i + j + k + l);
		}
	}

	
	public class MethodOverload {
		public static void main(String[] args) {
			Calc.addNums(10, 20);
			Calc.addNums(10, 20, 30);
			Calc.addNums(10, 20, 30, 40);

		}
		
		
//		class PrintName {
//
//			static void FirstName(String firstname) {
//				System.out.println(i + j);
//			}
//
//			static void LastName(String firstname, String lastname) {
//				System.out.println(i + j + k);
//			}
//
//			static void addNums(int i, int j, int k, int l) {
//				System.out.println(i + j + k + l);
//			}
//		}
//
//		
//		public class MethodOverload {
//			public static void main(String[] args) {
//				Calc.addNums(10, 20);
//				Calc.addNums(10, 20, 30);
//				Calc.addNums(10, 20, 30, 40);
//
//			}
		

	}

