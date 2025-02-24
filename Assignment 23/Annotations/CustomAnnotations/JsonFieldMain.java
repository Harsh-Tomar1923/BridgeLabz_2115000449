import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class Person {
    @JsonField(name = "user_name")
    String username = "ABC";
}

public class JsonFieldMain {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field field = person.getClass().getDeclaredField("username");
        JsonField annotation = field.getAnnotation(JsonField.class);
        System.out.println("{\"" + annotation.name() + "\": \"" + field.get(person) + "\"}");
    }
}