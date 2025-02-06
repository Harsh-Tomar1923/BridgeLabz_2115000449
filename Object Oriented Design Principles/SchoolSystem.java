package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getStudentName());
        }
    }
}

// Student class
class Student {
    private String studentName;
    private List<Course> enrolledCourses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }
}

// School class
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Shivedale School");

        Student student1 = new Student("Harsh");
        Student student2 = new Student("Ayush");

        school.addStudent(student1);
        school.addStudent(student2);

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        school.showStudents();
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
    }
}
