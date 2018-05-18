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
		String s=scan.nextLine();
		String[] a=s.split(" ");
		int i;
		for(String word:a)
		{
		String revString=new StringBuffer(word).reverse().toString();
		System.out.print(revString+" ");	
		}
		
	}
}
