//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class birthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Variable Declarations
        int birthMonth = 0;
        String trash = "";
        // input values from the user
        System.out.print("Enter your numeric birth month 1-12: ");
        if (in.hasNextInt())
        {
            // OK safe to read in an integer
            birthMonth = in.nextInt();
            in.nextLine(); // clears the newline from the buffer
            // process them
            if (birthMonth == 1)
            {
                System.out.println("Your birth month is January");
            }
            else if (birthMonth == 2)
            {
                System.out.println("Your birth month is February");
            }
            else if (birthMonth == 3)
            {
                System.out.println("Your birth month is March");
            }
            else if (birthMonth == 4)
            {
                System.out.println("Your birth month is April");
            }
            else if (birthMonth == 5)
            {
                System.out.println("Your birth month is May");
            }
            else if (birthMonth == 6)
            {
                System.out.println("Your birth month is June");
            }
            else if (birthMonth == 7)
            {
                System.out.println("Your birth month is July");
            }
            else if (birthMonth == 8)
            {
                System.out.println("Your birth month is August");
            }
            else if (birthMonth == 9)
            {
                System.out.println("Your birth month is September");
            }
            else if (birthMonth == 10)
            {
                System.out.println("Your birth month is October");
            }
            else if (birthMonth == 11)
            {
                System.out.println("Your birth month is November");
            }
            else if (birthMonth == 12)
            {
                System.out.println("Your birth month is December");
            }
            else
            {
                System.out.println("Please enter only a numeric birth month 1-12");
            }
        }
        else
        {
            // Not an integer, so can't use nextInt()!
            trash = in.nextLine();

            System.out.println("\nYou entered: " + trash);
            System.out.println("Please enter only a numeric birth month 1-12.");
        }
    }

}