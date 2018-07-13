package creational.sigleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // protect against reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance to instantiate this class.");
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
