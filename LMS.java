import java.util.ArrayList;
import java.util.Scanner;
public class LMS
{
    
    public static ArrayList<Integer> bookIDs = new ArrayList<>();
    public static ArrayList<String> titles = new ArrayList<>();
    public static ArrayList<String> authors = new ArrayList<>();
    public static ArrayList<Integer> totalQuantities = new ArrayList<>(); // Total copies owned by library
    public static ArrayList<Integer> availableQuantities = new ArrayList<>(); // Copies available to borrow
    public static ArrayList<String> bookStatus = new ArrayList<>(); // e.g., "Good", "Damaged"
    
public static ArrayList<Integer> issuedBooksIDs = new ArrayList<>();
    public static ArrayList<String> issuedBookTitles = new ArrayList<>();
    public static ArrayList<String> issuedBooksAuthors = new ArrayList<>();

    public static ArrayList<String> memberNames = new ArrayList<>();
    public static ArrayList<Integer> memberIds = new ArrayList<>();

    public static int[] roomNumbers = new int[5];
    public static String[] roomStatus = new String[5];
    public static String[] reservedByMember = new String[5];

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

    private static void roomMenu()
    {
        System.out.println("\n--- Study Room Management Menu ---");
        System.out.println("1. Show Available Study Rooms");
        System.out.println("2. Reserve a study room");
        System.out.println("3. Cancel Reservation");
        System.out.println("4. Check Reservation Status");
        System.out.println("5. Back to Main Menu");
    }

    private static void memberMenu()
    {
        System.out.println("\n--- Membership Management Menu ---");
        System.out.println("1. Register a new member");
        System.out.println("2. Display all members");
        System.out.println("3. Search members by ID or Name");
        System.out.println("4. View issued books by a member");
        System.out.println("5. Remove member");
        System.out.println("6. Back to Main Menu");
    }

    public static void addBook(Scanner input) 
    {
        System.out.println("\n--- Add a New Book ---");
        System.out.print("Enter new Book ID: ");
        int id = input.nextInt();
        bookIDs.add(id);
        input.nextLine();
        System.out.print("Enter Book Title: ");
        String title = input.nextLine();
        titles.add(title);
        System.out.print("Enter Author Name: ");
        String author = input.nextLine();
        authors.add(author);
        System.out.print("Enter Total Quantity purchased: ");
        int total = input.nextInt();
        totalQuantities.add(total);
        input.nextLine(); 
        System.out.println("-> Collected details for: " + title + " (ID: " + id + ", Qty: " + total + ") by "+author); 
    }

    public static void removeBook(Scanner input) 
    {
        System.out.println("\n--- Remove a Book ---");
        System.out.print("Enter Book ID to remove: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("-> Attempting to remove book with ID: " + id);
        for (int i=0; i < bookIDs.size(); i++){
            if (bookIDs.get(i)==id){
                bookIDs.remove(i);
                titles.remove(i);
                authors.remove(i);
                totalQuantities.remove(i);
                System.out.println("Book Removed Successfully");
            }
        }
    }

    public static void searchBook(Scanner input) 
    {
        System.out.println("\n--- Search Book ---");
        System.out.println("Search by (1) ID or (2) Author?");
        System.out.print("Enter option (1 or 2): ");
        int type = input.nextInt();
        input.nextLine();

        if (type == 1) 
        {
            System.out.print("Enter Book ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("-> Searching for book with ID: " + id);
            for (int i=0; i < bookIDs.size(); i++){
                if (bookIDs.get(i)==id){
                    System.out.println(bookIDs.get(i));
                    System.out.println(titles.get(i));
                    System.out.println(authors.get(i));
                }
                else{
                    System.out.println("Book with given ID not found");
                }
            }
        }
         else if (type == 2) 
         {
            System.out.print("Enter Author Name: ");
            String authorName = input.nextLine();
            System.out.println("-> Searching for books by author: " + authorName);

            for (int i = 0; i < authors.size(); i++){
                if (authors.get(i).equalsIgnoreCase(authorName)){
                    System.out.println("Book found");
                    System.out.println("Book Id: "+bookIDs.get(i));
                    System.out.println("Book Name: "+titles.get(i));
                    System.out.println("Author Name: "+authors.get(i));
                }
                else{
                    System.out.println("Book not found");
                }
            }
        } else 
        {
            System.out.println("[!] Invalid search option.");
        }
    }

    public static void displayAvailableBooks()
    {
        System.out.println("-> Functionality to display all available books.");
    }

    public static void issueBook(Scanner input) 
    {
        System.out.println("\n--- Issue a Book ---");
        System.out.print("Enter Book ID to issue: ");
        int bookId = input.nextInt();
        System.out.print("Enter Member ID: ");
        int memberId = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter today's Date (YYYY-MM-DD): ");
        String date = input.nextLine();
        System.out.println("-> Attempting to issue Book " + bookId + " to Member " + memberId + " on " + date);
    }

    public static void returnBook(Scanner input) 
    {
        System.out.println("\n--- Return a Book ---");
        System.out.print("Enter Book ID to return: ");
        int bookId = input.nextInt();
        System.out.print("Enter Member ID who is returning the book: ");
        int memberId = input.nextInt();
        input.nextLine();
        System.out.println("-> Attempting to return Book " + bookId + " from Member " + memberId);
    }

    public static void updateBookDetails(Scanner input) 
    {
        System.out.println("\n--- Update Book Details ---");
        System.out.print("Enter Book ID to update: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("1. Update Total Quantity");
        System.out.println("2. Update Book Status (e.g., Damaged, Lost)");
        System.out.print("Enter update choice (1 or 2): ");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 1) 
        {
            System.out.print("Enter NEW total quantity: ");
            int newTotal = input.nextInt();
            input.nextLine();
            System.out.println("-> Updating quantity of Book " + id + " to " + newTotal);
        } 
        else if (choice == 2) 
        {
            System.out.print("Enter new status (e.g., Damaged, Good): ");
            String newStatus = input.nextLine();
            System.out.println("-> Updating status of Book " + id + " to " + newStatus);
        }
    }

    public static void showAllIssuedBooks() 
    {
        System.out.println("-> Functionality to show all issued books (transaction log).");
    }

    public static void backToMainMenu() 
    {
        System.out.println("-> Returning to Main Menu.");
    }

    public static void showAvailableRooms() 
    {
        System.out.println("\n--- Available Study Rooms ---");
        System.out.printf("%-10s | %-15s | %-15s%n", "Room No.", "Status", "Reserved By");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 5; i++){
            System.out.printf("%-10d | %-15s | %-15s%n", roomNumbers[i],roomStatus[i],reservedByMember[i]);
        }
    }

    public static void reserveRoom() 
    {
        System.out.println("-> Functionality to reserve a study room.");
    }

    public static void cancelReservation() 
    {
        System.out.println("-> Functionality to cancel a reservation.");
    }

    public static void checkReservationStatus(Scanner scanner) 
    {
        System.out.println("-> Functionality to check reservation status.");
    }

    public static void registerNewMember(Scanner input) 
    {
        System.out.println("\n--- Register a New Member ---");
        System.out.print("Enter Member Name: ");
        String name = input.nextLine();
        memberNames.add(name);
        System.out.println("Enter a new Id: ");
        int newId = input.nextInt();
        memberIds.add(newId);
        System.out.println("\n[+] Member '" + name + "' registered successfully.");
        System.out.println("[*] Assigned Member ID: " + newId);
    }

    public static void displayAllMembers() 
    {
        System.out.println("\n--- All Registered Members ---");
        System.out.printf("%-15s | %-30s%n", "Member ID", "Name");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < memberIds.size(); i++){
            System.out.printf("%-15s | %-30s%n",memberIds.get(i),memberNames.get(i));
        }
    }

    public static void searchMember(Scanner input) {
        System.out.println("\n--- Search Member ---");
        System.out.println("Search by (1) ID or (2) Name?");
        System.out.print("Enter option (1 or 2): ");
        int type = input.nextInt();
        input.nextLine();

        if (type == 1) {
            System.out.print("Enter Member ID: ");
            int id = input.nextInt();
            input.nextLine();
            for (int i = 0; i < memberIds.size(); i++) {
                if (memberIds.get(i) == id) {
                    System.out.println("Member found");
                    System.out.println("Id: " + memberIds.get(i));
                    System.out.println("Name: " + memberNames.get(i));
                }
            }
        } else if (type == 2) {
            System.out.print("Enter Member Name: ");
            String name = input.nextLine();

            for (int i = 0; i < memberNames.size(); i++) {
                if (memberNames.get(i).equalsIgnoreCase(name)) {
                    System.out.println("Member found");
                    System.out.println("Member Id: " + memberIds.get(i));
                    System.out.println("Member Name: " + memberNames.get(i));
                } else {
                    System.out.println("Member not found");
                }
            }
        }
        else{
            System.out.println("[!] Invalid search option.");
        }
    }

    public static void viewIssuedBooksByMember(Scanner input) 
    {
        System.out.println("\n--- View Issued Books by Member ---");
        System.out.print("Enter Member ID: ");
        int id = input.nextInt();
        input.nextLine();


        System.out.println("\n--- Books Issued to Member " + id + " ---");
        System.out.printf("%-10s | %-30s | %-15s%n", "Book ID", "Title", "Issue Date");
        System.out.println("---------------------------------------------------------------");
    }

    public static void removeMember(Scanner input) 
    {
        System.out.println("\n--- Remove Member ---");
        System.out.print("Enter Member ID to remove: ");
        int id = input.nextInt();
        input.nextLine();
        

        if (id == 5002) {
            System.out.println("\n[+] Member ID 5002 removed successfully.");
        } else if (id == 5001) {
            System.out.println("\n[!] Removal Failed: Member 5001 has outstanding books.");
        } else {
            System.out.println("\n[!] Member ID not found.");
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        displayMainMenu();
        System.out.println();
        
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        while (choice!=4){

            if(choice < 1 || choice >4)
            {
                System.out.println("Invalid Choice, Please try again");
            }

            if (choice == 1)
            {
                int bookChoice;
                bookMenu();
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
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("[!] Invalid choice. Please try again.");
                        break;
                }
            }
            if (choice == 2)
            {
                int roomChoice;
                roomMenu();
                System.out.println();
                System.out.print("Enter choice: ");
                roomChoice = input.nextInt();
                switch (roomChoice) {
                    case 1:
                        showAvailableRooms();
                        break;
                    case 2:
                        reserveRoom();
                        break;
                    case 3:
                        cancelReservation();
                        break;
                    case 4:
                        checkReservationStatus(input);
                        break;
                    case 5:
                        System.out.println("-> Returning to Main Menu.");
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("[!] Invalid choice. Please try again.");
                        break;
                }
            }

            if (choice == 3)
            {
                int memberChoice;
                memberMenu();
                System.out.println();
                System.out.print("Enter choice: ");
                memberChoice = input.nextInt();
                switch (memberChoice) {
                    case 1:
                        registerNewMember(input);
                        break;
                    case 2:
                        displayAllMembers();
                        break;
                    case 3:
                        searchMember(input);
                        break;
                    case 4:
                        viewIssuedBooksByMember(input);
                        break;
                    case 5:
                        removeMember(input);
                        break;
                    case 6:
                        System.out.println("-> Returning to Main Menu.");
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("[!] Invalid choice. Please try again.");
                        break;
                }
            }
        }

        System.exit(0);

        input.close();
    }
}