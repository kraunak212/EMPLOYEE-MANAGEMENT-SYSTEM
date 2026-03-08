package empMng;

import java.io.*;
import java.util.ArrayList;

 // * This class handles all file related operations

public class EmployeeFileHandler {

    // File name where employee objects will be stored
    private static final String FILE_NAME = "employees.dat";


    // * Save employees to file

    public static void saveEmployees(ArrayList<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);

            System.out.println("Employee data saved to file.");

        } catch (IOException e) {

            System.out.println("Error saving employee data: " + e.getMessage());
        }
    }


     // * Load employees from file


    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> loadEmployees() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (ArrayList<Employee>) ois.readObject();

        } catch (Exception e) {

            System.out.println("Error loading employee data: " + e.getMessage());
        }

        return new ArrayList<>();
    }
}