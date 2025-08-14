import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDAO {

    public void addEmployee(Connection con, Scanner sc) throws SQLException{
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        String sql = EmployeeSQL.INSERT_EMPLOYEE;
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    public void viewEmployees(Connection con) throws SQLException{
        String sql = EmployeeSQL.SELECT_ALL_EMPLOYEES;
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("---------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println("---------------------------");
            }
        }
    }

    public void updateEmployee(Connection con, Scanner sc) throws SQLException{
        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new department: ");
        String dept = sc.nextLine();
        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();

        String sql = EmployeeSQL.UPDATE_EMPLOYEE;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) updated.");
        }
    }

    public void deleteEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();
        String sql = EmployeeSQL.DELETE_EMPLOYEE;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) deleted.");
        }
    }

}
