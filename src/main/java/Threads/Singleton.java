package Threads;

public class Singleton {

    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to provide access to the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance if it's null
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

