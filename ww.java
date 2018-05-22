import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
     public static void main(String []args)
     {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j;
        int[] a=new int[n];
        int k;
        k=scan.nextInt();
        int sum=0;
        int count=0;
        for(i=0;i<n;i++)
        {
        	a[i]=scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	for(j=0;(j<n&&j!=i);j++)
        	{
        		if((a[i]+a[j])==k)
        		{
        			System.out.print("YES");
        			count++;
        			break;
        		}
        	}
        }
        if(count==0)
        {
        	System.out.print("no");
        }
     
     }
}
