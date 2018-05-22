/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			
		}
		int sum=0;
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
		sum=sum+a[i];	
		}
		System.out.print(sum);
	}
}
