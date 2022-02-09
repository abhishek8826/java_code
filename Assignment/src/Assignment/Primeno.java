package Assignment;

public class Primeno
{
	public static void main(String[] args) 
	{
		System.out.println("list of prime numbers");
		int Prime = 0;
		for(int i = 2;i <= 100; i++)
		{
			int p = 2;
			for(int j = i; j>=1; j--)
			{
				if(i % j == 0)
				{
				p++;
				}
			}
			if(p==2)
			{
				Prime = Prime + i;
			}
			System.out.println(Prime);
		}
		
	}

}

