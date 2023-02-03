import java.util.Scanner;

public class ScanningValues {

    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Please enter the value for a.");
     int a=sc.nextInt();
     System.out.println("Please enter the value for b.");
     int b=sc.nextInt();

     if(a==b)
     {
         System.out.println(a + " is equal to " + b);
     }
     else
     {
         System.out.println(a + " is not equal to " + b);
     }
    }
}
