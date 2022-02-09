package Assignment;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		int num3 = 0;
		System.out.println("enter num2");
		int num2 = sc.nextInt();
		 num3 = num1;
		 num1 = num2;
		 num2 = num3;
		 System.out.println("New value of num1 is "+num1);
		 System.out.println("New value of num2 is "+num2);
		 
	}

}
