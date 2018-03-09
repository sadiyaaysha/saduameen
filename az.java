/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereint n;
     Scanner s=new Scanner(System.in);
     int n;
     n=s.nextInt();
     int temp;
     int sum=0;
     while(n>0)
     {
     	temp=n%10;
     	sum=sum+temp;
     	n=n/10;
     }
System.out.print(sum);
	}
}
