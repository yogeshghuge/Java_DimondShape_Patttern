/*
555555555
 4444444
  33333
   222
    1
*/

class numHalfDimond8
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int j=1; j<=(i*2)-1;j++)
				System.out.print(i);

		
			System.out.println();
		}
	}
}
			