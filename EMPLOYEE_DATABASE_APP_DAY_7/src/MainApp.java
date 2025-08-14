import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;   

public class MainApp {
    public static void main(String[] args) {
        try(Connection con = DBConnection.getConnection();
            Scanner sc = new Scanner(System.in)){

            EmployeeDAO employeeDAO = new EmployeeDAO();
            System.out.println("Connected to DB!");

             while (true) {
                System.out.println("\n1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> employeeDAO.addEmployee(con, sc);
                    case 2 -> employeeDAO.viewEmployees(con);
                    case 3 -> employeeDAO.updateEmployee(con, sc);
                    case 4 -> employeeDAO.deleteEmployee(con, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}