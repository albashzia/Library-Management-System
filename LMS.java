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

        if (choice == 2)
        {
            System.out.println("\n--- Study Room Management Menu ---");
            System.out.println("1. Show Available Study Rooms");
            System.out.println("2. Reserve a study room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Check Reservation Status");
            System.out.println("5. Back to Main Menu");
        }

        if (choice == 3)
        {
            
            System.out.println("\n--- Membership Management Menu ---");
            System.out.println("1. Register a new member");
            System.out.println("2. Display all members");
            System.out.println("3. Search members by ID or Name");
            System.out.println("4. View issued books by a member");
            System.out.println("5. Remove member");
            System.out.println("6. Back to Main Menu");
        }
        
        if (choice==4)
        {
            System.out.println("Thanks for using LMS");
            System.exit(0);
        }

        if(choice < 1 || choice >4)
        {
            System.out.println("Invalid Choice, Please try again");
        }
    }
}