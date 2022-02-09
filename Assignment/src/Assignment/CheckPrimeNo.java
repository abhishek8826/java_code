package Assignment;

import java.util.Scanner;

public class CheckPrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int k ;
		boolean isprime = true;
		for(int i = 2;i<=number;i++)
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