package Assignment;

public class SumDivisible {
	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 101; i < 200; i++)
		{
			if(i%7==0)
				sum = sum + i;
		}
		System.out.println(sum);
	}
}
