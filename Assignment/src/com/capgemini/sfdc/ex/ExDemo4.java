package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class ExDemo4 {
	

		public static void checkProduct(int ProductWeight) {
			if (ProductWeight <= 100) {
				System.out.println("Product is ok");
			} else {
				throw new InvalidProductException("Invalid Product.");
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Weight : ");

			int ProductWeight = sc.nextInt();
			try {
				ExDemo4.checkProduct(ProductWeight);
			} catch (InvalidProductException ipe) {
				System.out.println(ipe.getMessage());
			} finally {
				sc.close();
			}
			//
			
			
			
	
		}
		}



		
	
		





