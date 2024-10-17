import java.util.Scanner;
public class Lar_No 
{
    public static void main (String [] args)
    {
        int x , y ,z ;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the 1st no.");
        x = s.nextInt();
        System.out.print("Enter the 2nd no.");
        y = s.nextInt();
        System.out.print("Enter the 3rd no.");
        z = s.nextInt();
        if (x>y && x>z)
        {
            System.out.println("Largest no. is:" +x);
        }
        else if(y>z && y>x) {
            System.out.println("Largest no. is:" +y);
        }
        else{
            System.out.println("Largest no. is:" +z);
        }
        s.close();
    }
}