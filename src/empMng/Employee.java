package empMng;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


 // * Employee class

public class Employee implements Serializable {

    // Basic employee attributes
    private String id;
    private String name;
    private String department;
    private String position;
    private double salary;
    private Date joinDate;

    // Constructor to initialize employee data
    public Employee(String id, String name, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;


        this.joinDate = new Date();
    }

    // Getter methods
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public Date getJoinDate() { return joinDate; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setPosition(String position) { this.position = position; }
    public void setSalary(double salary) { this.salary = salary; }


     // * Custom toString method

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return String.format(
                "ID: %s, Name: %s, Dept: %s, Position: %s, Salary: ₹%.2f, Joined: %s",
                id, name, department, position, salary, sdf.format(joinDate));
    }
}