/*
123454321
 1234321
  12321
   121
    1
   121
  12321
 1234321
123454321class numDimond3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=n; j>i; j--)
				System.out.print(" ");
			for(int j=1; j<=i;j++)
				System.out.print(j);
			for(int j=i-1; j>=1;j--)
				System.out.print(j);

			
		System.out.println();
		}
		for(int i=2; i<=n;i++)
		{
			for(int j=n; j>i; j--)
				System.out.print(" ");
			for(int j=1; j<=i;j++)
				System.out.print(j);
			for(int j=i-1; j>=1;j--)
				System.out.print(j);

			
		System.out.println();
		}

		
	}
}