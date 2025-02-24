import java.lang.reflect.*;
import java.util.*;

class ObjectMap {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }
}

class User {
    public String name;
    public int age;
}

public class ObjectMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John");
        properties.put("age", 30);
        User user = ObjectMap.toObject(User.class, properties);
        System.out.println("User: " + user.name + ", Age: " + user.age);
    }
}
