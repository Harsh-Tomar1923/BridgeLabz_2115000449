import java.lang.annotation.*;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {
}

class Calculator {
    private HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int num) {
        if (cache.containsKey(num)) {
            return cache.get(num);
        }
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

public class CacheResultMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.square(5));
        System.out.println(calc.square(5));
    }
}
