/*
AAAAAAAAA
 BBBBBBB
  CCCCC
   DDD
    E
*/
class alpHalfDimond7
{
	
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j>1; j--)
				System.out.print(" ");
			for(int j=1; j<=((n-i+1)*2)-1;j++)
				System.out.print((char)(i+64));
		
			System.out.println();
		}
	}
}
