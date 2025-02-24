import java.lang.reflect.*;

class TestClass {
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class ExecutionTiming {
    public static void main(String[] args) throws Exception {
        Method method = TestClass.class.getMethod("slowMethod");
        TestClass obj = new TestClass();
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) / 1_000_000 + " ms");
    }
}
