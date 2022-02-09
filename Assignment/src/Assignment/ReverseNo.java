package Assignment;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rev = 0;
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		while(num1!=0)
		{
			rev = rev*10 + num1%10;
			num1 = num1/10;
		}
		System.out.println("Reverse number is : "+rev);
	}
}
