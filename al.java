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
		int i,j;
		
	int[] a=new int[n];
	int mul=1;
	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	for(i=0;i<n;i++)
	{
		mul=mul*a[i];
	}
	System.out.print(mul);
	}
}
