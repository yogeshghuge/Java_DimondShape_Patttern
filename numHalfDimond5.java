/*
    5
   545
  54345
 5432345
543212345
*/

class numHalfDimond5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=i; j>1;j--)
				System.out.print(" ");
			for(int j=n; j>=i;j--)
				System.out.print(j);
			for(int j=i+1; j<=n;j++)
				System.out.print(j);
	
			System.out.println();
		}
	}
}