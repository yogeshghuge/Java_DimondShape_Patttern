/*
543212345
 4321234
  32123
   212
    1
*/

class numHalfDimond11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
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