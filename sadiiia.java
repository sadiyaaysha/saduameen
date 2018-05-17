/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		
		int n;

		Scanner scan=new Scanner(System.in);
		int i;
		
			n=scan.nextInt();
				int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		
		}

		for(i=0;i<n;i=i+2)
		{
		System.out.print(a[i]);
		}
		for(i=1;i<n;i=i+2)
		{
			System.out.print(a[i]);
		}
	}
}
