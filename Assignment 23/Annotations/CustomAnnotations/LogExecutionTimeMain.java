import java.lang.annotation.*;
// import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Performance {
    @LogExecutionTime
    void task() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}

public class LogExecutionTimeMain {
    public static void main(String[] args) {
        new Performance().task();
    }
}