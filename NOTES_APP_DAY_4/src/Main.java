import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        NoteApp app = new NoteApp();
        System.out.println("Note application started.");

        Scanner sc = new Scanner(System.in);
        String fileName;
        int choice;

        do {
            System.out.println("\n== Notes App ===");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the file name to store notes:");
                    fileName = sc.nextLine();
                    app.addNote(sc, fileName);
                    break;

                case 2:
                    System.out.println("Enter the file name to view notes (or press Enter to use default):");
                    fileName = sc.nextLine();
                    if (fileName.trim().isEmpty()) {
                        System.out.println("File not found");
                        break;
                    }
                    System.out.println("Viewing notes from: " + fileName);
                    app.viewNotes(fileName);
                    break;

                case 3:
                    System.out.println("Exiting the application.");
                    break;
            
                default:
                    break;
            }

        } while (choice != 3);

        sc.close();
        System.out.println("Thank you for using the Notes App!");
    }
}
