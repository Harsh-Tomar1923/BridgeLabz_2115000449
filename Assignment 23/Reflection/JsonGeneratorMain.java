import java.lang.reflect.*;
// import java.util.*;

class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"" + fields[i].getName() + "\": \"" + fields[i].get(obj) + "\"");
            if (i < fields.length - 1)
                json.append(", ");
        }
        json.append("}");
        return json.toString();
    }
}

public class JsonGeneratorMain {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.name = "ABC";
        user.age = 25;
        System.out.println(JsonGenerator.toJson(user));
    }
}
