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
int i=0;
int temp;
while(n>0)
{
	temp=n%10;
	i++;
	n=n/10;
}
System.out.print(i);
}
}
