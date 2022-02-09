package Assignment;

public class Pattern  {
		public static void main(String[] args) {
			
	int i,j;
	
System.out.println("First Pattern\n");
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("\nSecond Pattern\n");
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("\nThitd Pattern\n");
	for(i=5;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("\nFourth Pattern\n");
	for(i=1;i<=5;i++)
	{
		for(j=i;j<=5;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}

		
		
		
}

