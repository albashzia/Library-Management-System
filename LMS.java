import java.util.Scanner;
public class LMS
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("               MAIN MENU");
        System.out.println("=============================================");
        System.out.println("1. Books Management");
        System.out.println("2. Study Room Management");
        System.out.println("3. Membership Management");
        System.out.println("4. Exit System");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.println("\n--- Books Management Menu ---");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search book by ID or Author");
            System.out.println("4. Display all available books");
            System.out.println("5. Issue a book");
            System.out.println("6. Return a book");
            System.out.println("7. Update book quantity / status");
            System.out.println("8. Show all issued books");
            System.out.println("9. Back to Main Menu");
        }
    }
}