public class EmployeeSQL {
    public static final String INSERT_EMPLOYEE = 
        "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
    
    public static final String SELECT_ALL_EMPLOYEES = 
        "SELECT * FROM employees";
    
    public static final String UPDATE_EMPLOYEE = 
        "UPDATE employees SET name=?, department=?, salary=? WHERE id=?";
    
    public static final String DELETE_EMPLOYEE = 
        "DELETE FROM employees WHERE id=?";
}