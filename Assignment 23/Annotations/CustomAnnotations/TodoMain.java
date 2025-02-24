import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();

    String assignedTo();

    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement authentication", assignedTo = "PQR", priority = "HIGH")
    void loginFeature() {
        System.out.println("Login feature");
    }

    @Todo(task = "Optimize database queries", assignedTo = "XYZ")
    void optimizeDB() {
        System.out.println("Optimizing database");
    }
}

public class TodoMain {
    public static void main(String[] args) throws Exception {
        Method[] methods = Project.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " - Task: " + todo.task() + ", Assigned To: " + todo.assignedTo()
                        + ", Priority: " + todo.priority());
            }
        }
    }
}