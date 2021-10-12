import org.junit.Test;
import ex46.wordFrequency;

public class wordFrequencyTest {
    @Test
    public void count() throws Exception {
        String words = "badger badger badger badger mushroom mushroom snake badger badger badger";
        wordFrequency frequency = new wordFrequency();
        frequency.count();
    }
}
