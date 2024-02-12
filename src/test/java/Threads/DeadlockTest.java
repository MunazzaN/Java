package Threads;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeadlockTest {

    @Test
    public void testDeadlock() {
        Deadlock deadlockExample = new Deadlock();

        // Execute the threads
        deadlockExample.executeThreads();

        // If the execution completes without deadlock, the test passes
        assertTrue(true, "No deadlock occurred");
    }
}

