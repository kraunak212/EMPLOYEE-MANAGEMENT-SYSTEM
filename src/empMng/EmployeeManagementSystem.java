package empMng;

import java.util.*;


  // * Main class that manages employees

public class EmployeeManagementSystem {


    private ArrayList<Employee> employees;


    private HashMap<String, Employee> employeeMap;

    private Scanner scanner;

    public EmployeeManagementSystem() {


        employees = EmployeeFileHandler.loadEmployees();

        employeeMap = new HashMap<>();


        for (Employee emp : employees) {

            employeeMap.put(emp.getId(), emp);
        }

        scanner = new Scanner(System.in);
    }


     // * Add new employee

    public void addEmployee() {

        System.out.println("\n=== ADD NEW EMPLOYEE ===");

        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();


        if (employeeMap.containsKey(id)) {

            System.out.println("Employee ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter Position: ");
        String pos = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee emp = new Employee(id, name, dept, pos, salary);

        employees.add(emp);
        employeeMap.put(id, emp);

        System.out.println("✅ Employee added successfully!");

        EmployeeFileHandler.saveEmployees(employees);
    }


    // * Display all employees

    public void viewEmployees() {

        System.out.println("\n=== ALL EMPLOYEES ===");

        if (employees.isEmpty()) {

            System.out.println("No employees found.");
            return;
        }

        for (Employee emp : employees) {

            System.out.println(emp);
        }
    }


     // * Search employee by ID

    public void searchEmployee() {

        System.out.print("Enter Employee ID: ");

        String id = scanner.nextLine();

        Employee emp = employeeMap.get(id);

        if (emp != null)
            System.out.println(emp);

        else
            System.out.println("Employee not found.");
    }


     // * Update employee details

    public void updateEmployee() {

        System.out.print("Enter Employee ID: ");

        String id = scanner.nextLine();

        Employee emp = employeeMap.get(id);

        if (emp == null) {

            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter new Name: ");
        emp.setName(scanner.nextLine());

        System.out.print("Enter new Department: ");
        emp.setDepartment(scanner.nextLine());

        System.out.print("Enter new Position: ");
        emp.setPosition(scanner.nextLine());

        System.out.print("Enter new Salary: ");
        emp.setSalary(Double.parseDouble(scanner.nextLine()));

        EmployeeFileHandler.saveEmployees(employees);

        System.out.println("Employee updated successfully.");
    }


     // * Delete employee

    public void deleteEmployee() {

        System.out.print("Enter Employee ID: ");

        String id = scanner.nextLine();

        Employee emp = employeeMap.remove(id);

        if (emp == null) {

            System.out.println("Employee not found.");
            return;
        }

        employees.remove(emp);

        EmployeeFileHandler.saveEmployees(employees);

        System.out.println("Employee deleted successfully.");
    }


     // * Rebuild HashMap after loading from file

    private void rebuildMap() {

        employeeMap.clear();

        for (Employee emp : employees)
            employeeMap.put(emp.getId(), emp);
    }


     // * Main menu of the system

    public void start() {

        while (true) {

            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Generate Reports");
            System.out.println("7. Save to File");
            System.out.println("8. Load from File");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: updateEmployee(); break;
                case 5: deleteEmployee(); break;
                case 6: EmployeeReportGenerator.showReports(employees); break;
                case 7: EmployeeFileHandler.saveEmployees(employees); break;

                case 8:
                    employees = EmployeeFileHandler.loadEmployees();
                    rebuildMap();

                    System.out.println("Employee data loaded successfully from file.");
                    System.out.println("Total Employees Loaded: " + employees.size());

                    break;

                case 9:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {

        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.start();
    }
}