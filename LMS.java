import java.util.Scanner;
public class LMS
{
    static final int MAX_BOOKS = 100;
    
    public static int[] bookIDs = new int[MAX_BOOKS];
    public static String[] titles = new String[MAX_BOOKS];
    public static String[] authors = new String[MAX_BOOKS];
    public static int[] totalQuantities = new int[MAX_BOOKS]; // Total copies owned by library
    public static int[] availableQuantities = new int[MAX_BOOKS]; // Copies available to borrow
    public static String[] bookStatus = new String[MAX_BOOKS]; // e.g., "Good", "Damaged"

    private static void displayMainMenu() 
    {
        System.out.println("\n=============================================");
        System.out.println("               MAIN MENU");
        System.out.println("=============================================");
        System.out.println("1. Books Management");
        System.out.println("2. Study Room Management");
        System.out.println("3. Membership Management");
        System.out.println("4. Exit System");
    }

    private static void bookMenu()
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

    public static void addBook(Scanner input) 
    {
        System.out.println("-> Functionality to add a book."); 
    }

    public static void removeBook(Scanner input) 
    {
        System.out.println("-> Functionality to remove a book.");
    }

    public static void searchBook(Scanner input) 
    {
        System.out.println("-> Functionality to search a book.");
    }

    public static void displayAvailableBooks()
    {
        System.out.println("-> Functionality to display all available books.");
    }

    public static void issueBook(Scanner input) 
    {
        System.out.println("-> Functionality to issue a book.");
    }

    public static void returnBook(Scanner input) 
    {
        System.out.println("-> Functionality to return a book.");
    }

    public static void updateBookDetails(Scanner input) 
    {
        System.out.println("-> Functionality to update book quantity / status.");
    }

    public static void showAllIssuedBooks() 
    {
        System.out.println("-> Functionality to show all issued books (transaction log).");
    }

    public static void backToMainMenu() 
    {
        System.out.println("-> Returning to Main Menu.");
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        displayMainMenu();
        System.out.println();
        
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1)
        {   
            int bookChoice;
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
            System.out.println();
        
            System.out.print("Enter your choice: ");
            bookChoice = input.nextInt();
            switch (bookChoice) {
                        case 1:
                            addBook(input);
                            break;
                        case 2:
                            removeBook(input);
                            break;
                        case 3:
                            searchBook(input);
                            break;
                        case 4:
                            displayAvailableBooks();
                            break;
                        case 5:
                            issueBook(input);
                            break;
                        case 6:
                            returnBook(input);
                            break;
                        case 7:
                            updateBookDetails(input);
                            break;
                        case 8:
                            showAllIssuedBooks();
                            break;
                        case 9:
                            backToMainMenu();
                            break;
                        default:
                            System.out.println("[!] Invalid choice. Please try again.");
                            break;
                    }
        }
        if (choice == 2)
        {
            int roomChoice;
            System.out.println("\n--- Study Room Management Menu ---");
            System.out.println("1. Show Available Study Rooms");
            System.out.println("2. Reserve a study room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Check Reservation Status");
            System.out.println("5. Back to Main Menu");
            System.out.println();
            System.out.print("Enter choice: ");
            roomChoice = input.nextInt();
            switch (roomChoice) {
                        case 1:
                            System.out.println("-> You chose to Show Available Study Rooms. (Functionality to be added later)");
                            break;
                        case 2:
                            System.out.println("-> You chose to Reserve a study room. (Functionality to be added later)");
                            break;
                        case 3:
                            System.out.println("-> You chose to Cancel Reservation. (Functionality to be added later)");
                            break;
                        case 4:
                            System.out.println("-> You chose to Check Reservation Status. (Functionality to be added later)");
                            break;
                        case 5:
                            System.out.println("-> Returning to Main Menu.");
                            break;
                        default:
                            System.out.println("[!] Invalid choice. Please try again.");
                            break;
                    }
        }

        if (choice == 3)
        {
            int memberChoice;
            System.out.println("\n--- Membership Management Menu ---");
            System.out.println("1. Register a new member");
            System.out.println("2. Display all members");
            System.out.println("3. Search members by ID or Name");
            System.out.println("4. View issued books by a member");
            System.out.println("5. Remove member");
            System.out.println("6. Back to Main Menu");
            System.out.println();
            System.out.print("Enter choice: ");
            memberChoice = input.nextInt();
            switch (memberChoice) {
                        case 1:
                            System.out.println("-> You chose to Register a new member. (Functionality to be added later)");
                            break;
                        case 2:
                            System.out.println("-> You chose to Display all members. (Functionality to be added later)");
                            break;
                        case 3:
                            System.out.println("-> You chose to Search members by ID or Name. (Functionality to be added later)");
                            break;
                        case 4:
                            System.out.println("-> You chose to View issued books by a member. (Functionality to be added later)");
                            break;
                        case 5:
                            System.out.println("-> You chose to Remove member. (Functionality to be added later)");
                            break;
                        case 6:
                            System.out.println("-> Returning to Main Menu.");
                            break;
                        default:
                            System.out.println("[!] Invalid choice. Please try again.");
                            break;
                    }
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

        input.close();
    }
}