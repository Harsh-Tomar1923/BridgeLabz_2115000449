package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation: Faculty members can exist independently)
class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

// Department class (Composition: Exists only within a University)
class Department1 {
    private String departmentName;

    public Department1(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

// University class (Composition: Contains Departments)
class University {
    private String universityName;
    private List<Department1> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department1(departmentName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department1 department : departments) {
            System.out.println(department.getDepartmentName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculty members in " + universityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getFacultyName());
        }
    }

    // Deleting university also deletes all its departments
    public void deleteUniversity() {
        departments.clear();  // Removing all departments
        System.out.println(universityName + " and all its departments have been deleted.");
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a University
        University university = new University("GLA University");

        // Adding Departments (Composition: They exist only within the University)
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Creating Faculty members (Aggregation: They can exist independently)
        Faculty faculty1 = new Faculty("Dr. Praveen");
        Faculty faculty2 = new Faculty("Dr. Brijesh");

        // Adding Faculty to the University
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Displaying details
        university.showDepartments();
        university.showFaculties();

        // Deleting the University (removes departments but faculty members still exist)
        university.deleteUniversity();

        // Showing that faculty members still exist independently
        System.out.println("Faculty members still exist:");
        System.out.println(faculty1.getFacultyName());
        System.out.println(faculty2.getFacultyName());
    }
}
