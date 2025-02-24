import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;

    User(String username) {
        if (username.length() > 5) {
            throw new IllegalArgumentException("Username too long");
        }
        this.username = username;
    }
}

public class MaxLengthMain {
    public static void main(String[] args) {
        User user = new User("John");
        System.out.println("Username: " + user.username);
    }
}
