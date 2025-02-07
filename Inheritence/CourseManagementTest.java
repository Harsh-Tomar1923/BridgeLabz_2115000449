package Inheritence;
class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
        System.out.println("Final Fee: " + getFinalFee());
    }
}

public class CourseManagementTest {
    public static void main(String[] args) {
        Course course1 = new Course("Java Basics", 6);
        OnlineCourse course2 = new OnlineCourse("Python for Data Science", 8, "Coursera", true);
        PaidOnlineCourse course3 = new PaidOnlineCourse("Machine Learning", 10, "Udacity", true, 500, 20);

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
        System.out.println();

        course3.displayCourseDetails();
    }
}
