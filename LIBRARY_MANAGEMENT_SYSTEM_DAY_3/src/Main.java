import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\n📚=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Add User");
            System.out.println("4. Show All Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String titleAdd = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String authorAdd = sc.nextLine();
                    library.addBook(new Book(titleAdd, authorAdd));
                    break;

                case 2:
                    library.showAllBooks();
                    break;

                case 3:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(name));
                    break;

                case 4:
                    library.showAllUsers();
                    break;

                case 5:
                    System.out.print("Enter user ID: ");
                    int issueUserId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title to issue: ");
                    String titleIssue = sc.nextLine();
                    User user = library.findUserById(issueUserId);
                    if (user != null) {
                        library.issueBook(titleIssue, user);
                    } else {
                        System.out.println("❌ User not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter user ID: ");
                    int returnUserId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title to return: ");
                    String title = sc.nextLine();
                    user = library.findUserById(returnUserId);
                    if (user != null) {
                        library.returnBook(title, user);
                    } else {
                        System.out.println("❌ User not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter title to delete: ");
                    String titleDelete = sc.nextLine();
                    library.deleteBook(titleDelete);
                    break;

                case 8:
                    System.out.println("👋 Exiting Library. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 8);
        sc.close();
    }
}
