    import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteApp {
    public void addNote(Scanner sc, String fileName) {
        System.out.print("Enter note content: ");
        String content = sc.nextLine();
        
        try(FileWriter  fw = new FileWriter(fileName, true)){
            fw.write(content + System.lineSeparator());
            System.out.println("Note added successfully.");
        }catch(Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void viewNotes(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String output;
            System.out.println("\nNotes: ");
            while ((output = br.readLine()) != null) {
                System.out.println("- " + output);
            }
        }catch(FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        catch(IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
