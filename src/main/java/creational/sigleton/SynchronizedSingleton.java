package creational.sigleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // protect against reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance to instantiate this class.");
        }
    }

    public static SynchronizedSingleton getInstance() {
        synchronized (SynchronizedSingleton.class) {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }
}
