package Assignment;
//import java.util.Scanner;

public class Table {
	
		
		public static void main(String[] args) {
		
//				Scanner sc = new Scanner(System.in);
//				System.out.println("enter num");
				int tables = 0;
//				int num = sc.nextInt();
				for(int i = 1;i<=10;i++)
				{
					System.out.println("\nTable of\n "+i);
					for(int j = 1;j<=10;j++)
					{
					tables = j*i;
					System.out.print(" " +tables +" ");
					
					}
					System.out.println("\n");
					
				}
					
			
	}

}
