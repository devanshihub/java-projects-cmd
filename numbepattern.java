public class numberpattern
{
	public static void main(String k[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter a number :");
		int n=ob.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
		    {
			   System.out.print(" ");
		    }
			for(int l=1;l<=i;l++)
		    {
				System.out.print(i+" ");
		    }
			System.out.println();
		}
	}
}
