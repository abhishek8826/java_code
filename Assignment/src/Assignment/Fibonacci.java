package Assignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int a = 0,b = 1,c;
		int num = sc.nextInt();
		if(num >= 0)
		{
			System.out.println(a);
			System.out.println(b);
		}
		for(int i = 2;i<=num;i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
		
}
}