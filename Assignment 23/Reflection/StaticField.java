import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "123456";
    
}

public class StaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "654321");
        System.out.println("Modified API_KEY: " + field.get(null));
    }
}
