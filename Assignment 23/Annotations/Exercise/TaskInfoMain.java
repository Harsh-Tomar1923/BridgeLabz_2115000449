import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();

    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "ABC")
    void task() {
        System.out.println("Task executed");
    }
}

public class TaskInfoMain {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("task");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}