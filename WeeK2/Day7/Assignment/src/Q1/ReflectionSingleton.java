package Q1;

public class ReflectionSingleton {
    private static ReflectionSingleton instance = new ReflectionSingleton();

    private ReflectionSingleton() {
        if (instance != null) {
            throw new RuntimeException("Singleton instance already exists");
        }
    }

    public static ReflectionSingleton getInstance() {
        return instance;
    }
}
