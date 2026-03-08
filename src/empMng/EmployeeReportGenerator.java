package empMng;

import java.util.ArrayList;

import java.util.*;

/*
 * This class generates different reports
 * like salary statistics, department summary etc.
 */
public class EmployeeReportGenerator {

    public static void showReports(ArrayList<Employee> employees) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== EMPLOYEE REPORTS ===");
        System.out.println("1. Department-wise Summary");
        System.out.println("2. Salary Statistics");
        System.out.println("3. Employee Count by Position");

        System.out.print("Enter choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                departmentSummary(employees);
                break;

            case 2:
                salaryStatistics(employees);
                break;

            case 3:
                positionCount(employees);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    /*
     * Generates salary statistics like
     * total salary, average salary etc.
     */
    private static void salaryStatistics(ArrayList<Employee> employees) {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        double total = 0;
        Employee highest = employees.get(0);
        Employee lowest = employees.get(0);


        for (Employee emp : employees) {

            total += emp.getSalary();

            if (emp.getSalary() > highest.getSalary())
                highest = emp;

            if (emp.getSalary() < lowest.getSalary())
                lowest = emp;
        }

        double avg = total / employees.size();

        System.out.println("\n💰 SALARY STATISTICS:");
        System.out.println("• Total Employees: " + employees.size());

        System.out.printf("• Total Salary: ₹%,.2f\n", total);
        System.out.printf("• Average Salary: ₹%,.2f\n", avg);

        System.out.printf("• Highest Salary: ₹%,.2f (%s)\n",
                highest.getSalary(), highest.getName());

        System.out.printf("• Lowest Salary: ₹%,.2f (%s)\n",
                lowest.getSalary(), lowest.getName());


        departmentSummary(employees);
    }

    /*
     * Department wise summary
     */
    private static void departmentSummary(ArrayList<Employee> employees) {

        HashMap<String, List<Employee>> map = new HashMap<>();


        for (Employee emp : employees) {

            map.putIfAbsent(emp.getDepartment(), new ArrayList<>());
            map.get(emp.getDepartment()).add(emp);
        }

        System.out.println("\n🏢 DEPARTMENT SUMMARY:");

        for (String dept : map.keySet()) {

            List<Employee> list = map.get(dept);

            double total = 0;

            for (Employee e : list)
                total += e.getSalary();

            double avg = total / list.size();

            System.out.printf("• %s: %d employees, Average: ₹%,.2f\n",
                    dept, list.size(), avg);
        }
    }

    /*
     * Shows how many employees exist for each position
     */
    private static void positionCount(ArrayList<Employee> employees) {

        HashMap<String, Integer> map = new HashMap<>();

        for (Employee emp : employees) {

            map.put(emp.getPosition(),
                    map.getOrDefault(emp.getPosition(), 0) + 1);
        }

        System.out.println("\n📊 EMPLOYEE COUNT BY POSITION:");

        for (String pos : map.keySet()) {

            System.out.println("• " + pos + ": " + map.get(pos));
        }
    }
}