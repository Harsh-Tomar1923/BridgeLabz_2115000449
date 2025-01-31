package oops2;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Unknown Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("B.Tech", 4, 200000);
        course1.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        Course course2 = new Course("Web Development", 6, 8000);
        course2.displayCourseDetails();
    }
}
