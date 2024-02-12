package Threads;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get the singleton instance twice
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances refer to the same object
        assertSame(instance1, instance2);
    }
}

