package Assignment;

import java.util.Scanner;

public class DaysToMonths {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days");
		int month = 0;
		
		int days = sc.nextInt();
	
		month = days/30;
		days = days % 30;
		System.out.println("Months = "+ month+"\nDays = "+days);
		
		
	}
}

