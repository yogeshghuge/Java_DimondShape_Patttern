/*
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
*/

class numDimond4
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n;j++)
				System.out.print(" ");
			for(int j=i; j>=1;j--)
				System.out.print(j);
			for(int j=2; j<=i;j++)
				System.out.print(j);
	
	
			System.out.println();
		}
	

		for(int i=n-1; i>=1; i--)
		{
			for(int j=i; j<n;j++)
				System.out.print(" ");
			for(int j=i; j>=1;j--)
				System.out.print(j);
			for(int j=2; j<=i;j++)
				System.out.print(j);
	
	
			System.out.println();
		}
	


	}
}
