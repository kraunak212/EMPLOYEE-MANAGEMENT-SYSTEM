# 🧑‍💼 Employee Management System (Java)

A **Java console-based Employee Management System** that allows users to manage employee records efficiently.
The system supports **CRUD operations, fast employee lookup, report generation, and file persistence** using Java Collections and Serialization.

---

# 📌 Project Overview

The **Employee Management System (EMS)** is designed to manage employee data in an organized way through a **menu-driven console application**.

The system stores employee information using **ArrayList** and enables **fast searching using HashMap**. It also allows users to **save and load employee data from a file**, ensuring data persistence across program executions.

### ✨ Key Features

✔ Add new employees
✔ View all employees
✔ Search employees (ID / Name / Department)
✔ Update employee information
✔ Delete employee records
✔ Generate salary statistics
✔ Department-wise employee summary
✔ Save employee data to file
✔ Load employee data from file

---

# 🛠 Technologies Used

| Technology       | Purpose                           |
| ---------------- | --------------------------------- |
| ☕ Java           | Core programming language         |
| 📦 ArrayList     | Store employee records            |
| ⚡ HashMap        | Fast employee lookup              |
| 💾 Serialization | Save and load employee data       |
| 🧠 OOP           | Object-oriented program structure |

---

# 📂 Project Structure

```
EmployeeManagementSystem/
│
├── Employee.java
├── EmployeeManagementSystem.java
├── EmployeeFileHandler.java
├── EmployeeReportGenerator.java
│
├── employees.dat
└── README.md
```

### 📄 File Description

| File                            | Description                               |
| ------------------------------- | ----------------------------------------- |
| `Employee.java`                 | Defines the Employee class and attributes |
| `EmployeeManagementSystem.java` | Main program with menu and operations     |
| `EmployeeFileHandler.java`      | Handles saving/loading employee data      |
| `EmployeeReportGenerator.java`  | Generates reports and statistics          |

---

# ⚙️ Setup Instructions

Follow these steps to run the project.

---

## 1️⃣ Install Java

Ensure **Java JDK 8 or higher** is installed.

Check installation:

```bash
java -version
```

---

## 2️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/employee-management-system.git
```

---

## 3️⃣ Navigate to the Project Folder

```bash
cd employee-management-system
```

---

## 4️⃣ Compile the Program

```bash
javac *.java
```

---

## 5️⃣ Run the Application

```bash
java EmployeeManagementSystem
```

---

# 🖥 Application Menu

When the program runs, the following menu appears:

```
=== EMPLOYEE MANAGEMENT SYSTEM ===
1. Add New Employee
2. View All Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Generate Reports
7. Save to File
8. Load from File
9. Exit
```

Users can select any option to manage employee data.

---

# 💾 Data Storage

Employee data is saved using **Java Object Serialization** in a file named:

```
employees.dat
```

The file stores a serialized:

```
ArrayList<Employee>
```

### 🧾 Employee Data Fields

* Employee ID
* Name
* Department
* Position
* Salary
* Join Date

---

# 📊 Example Output

### ➕ Add Employee

```
=== ADD NEW EMPLOYEE ===
Enter Employee ID: E001
Enter Name: Alice Johnson
Enter Department: Engineering
Enter Position: Software Developer
Enter Salary: 85000

✅ Employee added successfully!
```

---

### 💰 Salary Statistics

```
SALARY STATISTICS

Total Employees: 4
Average Salary: ₹90,000
Highest Salary: ₹105,000
Lowest Salary: ₹75,000
```

---

# 🧪 Testing

The system was tested using multiple test cases.

| Test Case | Operation       | Result    |
| --------- | --------------- | --------- |
| TC1       | Add Employee    | ✅ Success |
| TC2       | View Employees  | ✅ Success |
| TC3       | Search Employee | ✅ Success |
| TC4       | Salary Report   | ✅ Success |
| TC5       | File Save/Load  | ✅ Success |

---


# 📚 Learning Outcomes

This project demonstrates:

✔ Java Object-Oriented Programming
✔ Java Collections Framework
✔ File handling using serialization
✔ Data structures (ArrayList & HashMap)
✔ Modular program design

---

# 🚀 Future Improvements

Possible enhancements:

* GUI version using **Java Swing / JavaFX**
* Database integration (**MySQL**)
* Web-based employee management system
* Authentication and role-based access

---

# 👨‍💻 Author

**Raunak kumar**
---
