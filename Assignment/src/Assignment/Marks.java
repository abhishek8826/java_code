package Assignment;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		if(num1>90)
			System.out.println("congratulations you have got Grade O and "+num1+" marks");
		else if(num1>80&&num1<=90)
			System.out.println("congratulations you have got Grade A+ and "+num1+" marks");
		else if(num1>70&&num1<=80)
			System.out.println("congratulations you have got Grade A and "+num1+" marks");
		else if(num1>60&&num1<=70)
			System.out.println("congratulations you have got Grade B+ and "+num1+" marks");
		else if(num1>50&&num1<=60)
			System.out.println("congratulations you have got Grade B and "+num1+" marks");
		else if(num1>40&&num1<=50)
			System.out.println("congratulations you have got Grade C and "+num1+" marks");
		else if(num1>33&&num1<=40)
			System.out.println("congratulations you have got Grade D and "+num1+" marks");
		else
			System.out.println("Sorry you have failed "+num1+" marks");
			
	}

}
