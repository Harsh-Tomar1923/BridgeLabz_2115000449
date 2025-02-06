package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

// Department class (Composition with Employee)
class Department {
    private String name;
    private List<Employee> employees;
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void listEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("  Employee: " + e.getName());
        }
    }
}

// Company class (Composition with Department)
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.getName().equals(deptName)) {  // Using getter instead of direct access
                return dept;
            }
        }
        return null;
    }

    public void listDepartments() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.listEmployees();
        }
    }
}

// Main class to demonstrate composition
public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        Department itDept = company.getDepartment("IT");
        Department hrDept = company.getDepartment("HR");

        if (itDept != null) {
            itDept.addEmployee("Harsh");
            itDept.addEmployee("Ayush");
        }

        if (hrDept != null) {
            hrDept.addEmployee("Anshika");
        }
        company.listDepartments();
    }
}
