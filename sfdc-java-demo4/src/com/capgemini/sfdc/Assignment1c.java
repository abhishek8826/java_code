
package com.capgemini.sfdc;
import java.util.Scanner;

public class Assignment1c {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		int num1 = sc.nextInt();
//		
//		System.out.println("enter num2");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Program to find greater number");
//		if(num1>num2)
//			System.out.println(num1);
//		else
//			System.out.println(num2);
//		
//		System.out.println("Program to find smaller number");
//		if(num1<num2)
//			System.out.println(num1);
//		else
//			System.out.println(num2);
//	}
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		int num1 = sc.nextInt();
//		if((num1+1)%2 == 0)
//			System.out.println(num1+1);
//		else
//			System.out.println(num1+2);
//	if(num1 % 2 != 0)
//		System.out.println(num1-2);
//	else
//		System.out.println(num1-1);
//	}
	
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		int num1 = sc.nextInt();
//		if(num1 % 2 != 0)
//			System.out.println(num1-2);
//		else
//			System.out.println(num1-1);
	//}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int number = sc.nextInt();
	int k ;
	boolean isprime = true;
	for(int i = 2;i<=number/2;i++)
	{
		k = number % i;
		if(k == 0)
		{
			isprime = false;
			break;
		}
	}
	if(isprime)
		System.out.println("number is prime");
	else
		System.out.println("not prime");
	}
}
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		int sum = 0;
//		int product = 1;
//		int num1 = sc.nextInt();
//		while(num1!=0)
//		{
//			sum += num1%10;
//			product = product*num1%10;
//			num1 = num1/10;
//		}
//		System.out.println(sum);
//		System.out.println(product);
//	}







//		
//	}
	
	
	
