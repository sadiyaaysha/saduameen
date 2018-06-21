import java.io.*;
import java.util.*;
 class Rextester
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int n=scan.nextInt();
        int i;
    char[] a=s.toCharArray();
    Arrays.sort(a);
String f=new String(a);
        while(n>0)
        {
           String d=scan.next();
          char[] a1=d.toCharArray();
           Arrays.sort(a1);
        String f1=new String(a1);
        if(f.equals(f1))
        {
            System.out.print("yes");
        }
            else
            {
                System.out.print("no");
            }
            
            n--;
            
        }
        
    }
}
