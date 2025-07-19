package assingment;


public class RightTringle { 
	public static void RightTringle1(int n)
	
	{
		int a,b;
		for(a=0;a<n;a++)
		{
			for(b=0;b<=a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int k = 5;
		RightTringle1(k);
	}

}
