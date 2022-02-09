package Assignment;

public class TableOneToTen {
		
			public static void main(String[] args) {
			
					int tables = 0;

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


