// Sum of first n integers
import java.util.*;

class Sum
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        int sum=0,i,n;
        System.out.println("Enter the number till which you want the addition"); 
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        sum=sum+i;
        System.out.println ("The sum from 1 to "+n+" integers is "+sum);
    }
}
