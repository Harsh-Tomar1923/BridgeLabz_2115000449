import java.util.*;

public class SuppressWarningsMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Test");
        System.out.println(list.get(0));
    }
}