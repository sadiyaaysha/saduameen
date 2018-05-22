import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
     public static void main(String []args)
     {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        char[] a=s.toCharArray();
            int n=s.length();
mmjmjj
         for(int i=0;i<n;i++)
         
     	{
     	for(int j=i+1;j<n;j++)
     	{
     		if(a[i]==a[j])
     		{
     			for(int k=j;k<n-1;k++)
     			{
     			a[k]=a[k+1];
     			
     			}
     		
     		n--;
     		j--;
     		}
     	}
     	}
    String ss=new String(a);
    ss=ss.substring(0,n);
    System.out.print(ss);
     
     }
}
