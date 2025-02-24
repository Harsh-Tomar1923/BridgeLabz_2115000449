import java.lang.reflect.*;

class Student {
    public Student() {
        System.out.println("Student object created");
    }
}

public class DynamicObject {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getConstructor();
        Student student = constructor.newInstance();

        System.out.println(student);
    }
}