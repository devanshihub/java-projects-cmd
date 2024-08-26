import java .util.*;
public class rectangle
{
	public static void main(String k[])
	{
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter a number :");
        int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
		    {
				if (i==0 || j==n-1 || j==0 || i==n-1)
			    System.out.print("* ");
                else
                System.out.print("  ");
		    }
			System.out.println();
		}
	}
}
