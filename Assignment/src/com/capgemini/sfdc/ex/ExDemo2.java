package com.capgemini.sfdc.ex;

public class ExDemo2 {
	

		public static void main(String[] args) {

			System.out.println("Start");

			int[] marksArray = { 98, 95, 97, 99, 96 };

			try {
				System.out.println(marksArray[7]); // 96

			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("Wrong index!");
			}
			finally {
				System.out.println("Done");
			}
			
			System.out.println("End");

		}

	}

