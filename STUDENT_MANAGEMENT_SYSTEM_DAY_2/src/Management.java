package STUDENT_MANAGEMENT_SYSTEM.src;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    // Add student
                    System.out.print("Enter Student ID: ");
                    Long id = sc.nextLong();
                    System.out.print("Enter Student Name: ");
                    String name = sc.next();
                    System.out.print("Enter Student Marks: ");
                    Double marks = sc.nextDouble();
                    students.add(new Student(id, name, marks));
                    break;
                case 2:
                    // View students
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    // Update student
                    System.out.print("Enter Student ID to update: ");
                    Long updateId = sc.nextLong();
                    for (Student student : students) {
                        if (student.getId().equals(updateId)) {
                            System.out.print("Enter new name: ");
                            String newName = sc.next();
                            System.out.print("Enter new marks: ");
                            Double newMarks = sc.nextDouble();
                            student.setName(newName);
                            student.setMarks(newMarks);
                            System.out.println("Student updated successfully.");
                            break;
                        }else{
                            System.out.println("Student not found with ID: " + updateId);
                        }
                    }
                    break;
                case 4:
                    // Delete student
                    System.out.print("Enter Student ID to delete: ");
                    Long deleteId = sc.nextLong();
                    students.removeIf(student -> student.getId().equals(deleteId));
                    System.out.println("Student deleted successfully.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (ch != 5);
        sc.close();
    }
}
