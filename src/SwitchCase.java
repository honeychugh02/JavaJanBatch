import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 1 for English");
        System.out.println("Please enter 2 for Spainish");
        System.out.println("Please enter 3 for French");
        int a= sc.nextInt();

        switch(a)
        {
            case 1:
                System.out.println("English is selected");
                break;

            case 2:
                System.out.println("Spainish is selected");
                break;

            case 3:
                System.out.println("French is selected");

            default:
                System.out.println("Please enter a valid input.");
        }

    }
}
