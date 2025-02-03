package Assignment0302;

class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Harsh", 101, 'B');
        Student student2 = new Student("Krishna", 102, 'B');

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        student1.updateGrade('A');
        System.out.println();
        student1.displayStudentDetails();

        displayTotalStudents();
    }
}
