package Assignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		if((num+1)%2 == 0)
			System.out.println("Smallest Even number, not smaller than given number is : "+(num+1));
		else
			System.out.println("Smallest Even number, not smaller than given number is : "+(num+2));
		
		if(num % 2 != 0)
			System.out.println("Biggest odd number, not bigger than given number is : "+(num-2));
		else
			System.out.println("Biggest odd number, not bigger than given number is : "+(num-1));
	}
	
}
