//Packages
import java.io.*;
import Calculator.Add;
import Calculator.Sub;
import Calculator.Mul;
import Calculator.Div;
class Operation
{
    public static void main(String a[])throws IOException
    {
        int choice=0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Add a1 = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        do
        {
            System.out.println("Enter the 2 numbers");
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            System.out.println("Enter your choice \n1. To Add the 2 numbers \n2. To 
            Subtract the 2 numbers \n3. To Multiply the 2 numbers \n4. To Divide the 2 numbers \n5. Exit ");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1 :
                System.out.println("The addition of "+x+" and "+y+" is 
                "+a1.add(x,y));
                break;
                case 2 :
                System.out.println("The Subtraction of "+x+" and 
                "+y+" is "+s.sub(x,y));
                break;
                case 3 :
                System.out.println("The Multiplication of "+x+" and 
                "+y+" is "+m.mul(x,y));
                break;
                case 4 :
                System.out.println("The Division of "+x+" and "+y+" 
                is "+d.div(x,y));
                break;
                case 5 :
                System.exit(0);
                default :
                System.out.println("INVALID INPUT");
                break;
            }
        }
        while(choice!=5);
    }
}
