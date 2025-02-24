import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class SecureSystem {
    @RoleAllowed("ADMIN")
    void secureTask(String role) {
        if (!role.equals("ADMIN")) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("Secure task executed");
    }
}

public class RoleAllowedMain {
    public static void main(String[] args) {
        SecureSystem obj = new SecureSystem();
        obj.secureTask("USER");
        obj.secureTask("ADMIN");
    }
}