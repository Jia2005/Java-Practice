// Admission in computer science
import java.util.*;
class Admission
{
    public static void main(String a[])
        {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter your Physics marks");
         int p=sc.nextInt();
         System.out.println("Enter your Chemistry marks");
         int c=sc.nextInt();
         System.out.println("Enter your Maths marks");
         int m=sc.nextInt();
         double pcm=(p+c+m)/3.0;
         System.out.println("Enter your CET marks");
         float CET=sc.nextFloat();
         if(CET>=98 && pcm>=75)
             System.out.println ("You are admitted");
         else
             System.out.println ("Better luck next time");
        }
}
