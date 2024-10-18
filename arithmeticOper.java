import java.util.Scanner;
public class arithmeticOper
{
    public static void main (String  args[])
    {
        int n,m ,add, mul, sub, opt;
        double div;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter 1st no. ");
        m = s.nextInt();
        System.out.print("Enter 2nd no. ");
        n = s.nextInt();

        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
            switch (opt) 
            {

        case 1:
        add = m + n;
        System.out.println("Result:"+add);
        break;

        case 2:
        sub = m - n;
        System.out.println("Result:"+sub);
        break;

        case 3:
        mul = m * n;
        System.out.println("Result:"+mul);
        break;

        case 4:
        div = (double)m / n;
        System.out.println("Result:"+div);
        break;    

        case 5:
        System.exit(0);
            }
            s.close();
            return;
        }
    }
}