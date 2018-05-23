/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
	Integer[] a=new Integer[n];
	int i,j;
	int count=0;
	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	int sum=0;
	a:for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]+a[j]==sum)
			{
				count=1;
				break a;
			}
			
		}
	}
	if(count==1)
	{
		System.out.print("yes");
	}
	else
	{
			System.out.print("no");
	}
	
	}
	
}
