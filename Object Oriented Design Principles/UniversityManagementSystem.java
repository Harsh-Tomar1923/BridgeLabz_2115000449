package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Course1 class
class Course1 {
    private String courseName;
    private Professor professor;
    private List<Student1> enrolledStudents;

    public Course1(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }

    public void enrollStudent(Student1 student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student1 student : enrolledStudents) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

// Student1 class (Association: Many-to-Many with Course1)
class Student1 {
    private String studentName;
    private List<Course1> courses;

    public Student1(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enrollCourse(Course1 course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void addCourse(Course1 course) {
        courses.add(course);
    }

    public void showEnrolledCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course1 course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Professor class (Aggregation: One professor teaches multiple courses)
class Professor {
    private String professorName;
    private List<Course1> courses;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    public void addCourse(Course1 course) {
        courses.add(course);
    }

    public void showAssignedCourses() {
        System.out.println("Professor " + professorName + " teaches:");
        for (Course1 course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating students
        Student1 student1 = new Student1("Harsh");
        Student1 student2 = new Student1("Ayush");

        // Creating professors
        Professor professor1 = new Professor("Dr. Ram");
        Professor professor2 = new Professor("Dr. Jatin");

        // Creating courses
        Course1 course1 = new Course1("Mathematics");
        Course1 course2 = new Course1("Computer Science");

        // Assigning professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Students enrolling in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display details
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        professor1.showAssignedCourses();
        professor2.showAssignedCourses();
        course1.showCourseDetails();
        course2.showCourseDetails();
    }
}
