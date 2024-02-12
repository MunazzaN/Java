package Additional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void testCountUniqueWords() {
        assertEquals(2, WordCounter.countUniqueWords("hello world hello"));
        assertEquals(3, WordCounter.countUniqueWords("apple banana cherry banana apple"));
        assertEquals(1, WordCounter.countUniqueWords("unique"));
        assertEquals(0, WordCounter.countUniqueWords(""));
        assertEquals(0, WordCounter.countUniqueWords(null));
    }
}



