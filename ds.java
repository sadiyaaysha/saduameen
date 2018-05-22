import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
     public static void main(String []args)
     {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int i,j;
        int count=0;
        int[] a=new int[n];
          int[] b=new int[k];
          for(i=0;i<n;i++)
          {
          	a[i]=scan.nextInt();
          }
          for(j=0;j<k;j++)
          {
          	b[j]=scan.nextInt();
          }
         for(i=0;i<n;i++)
         {
         	for(j=0;j<k;j++)
         	{
         		if(b[j]==a[i])
         		{
         			count++;
         		}
         	}
         }
     if(count==k)
     {
     	System.out.print("YES");
     }
     else
     {
     	System.out.print("NO");
     }
     }
}
