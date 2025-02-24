import java.lang.reflect.*;
// import java.util.*;

@interface Inject {
}

class Service {
}

class Client {
    @Inject
    private Service service;

    public Service getService() {
        return service;
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, new Service());
            }
        }
        System.out.println("Dependency Injected: " + (client.getService() != null));
    }
}
