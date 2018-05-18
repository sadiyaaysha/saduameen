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
		int n;
		n=scan.nextInt();
		int[] a=new int[n];
		int i;
                        int j;
                        int swap;
                        for(i=0;i<n;i++)
                        {
                        	a[i]=scan.nextInt();
                        }
                   Arrays.sort(a);
                   for(i=n-1;i>=0;i--)
                   {
                   	System.out.print(a[i]);
                   }
                        	
                        }
		
		
	}
