import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Utility {
    @ImportantMethod(level = "HIGH")
    void criticalTask() {
        System.out.println("Executing critical task");
    }

    @ImportantMethod(level = "MEDIUM")
    void regularTask() {
        System.out.println("Executing regular task");
    }
}

public class ImportantMethodMain {
    public static void main(String[] args) throws Exception {
        Method[] methods = Utility.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " - Level: " + im.level());
            }
        }
    }
}