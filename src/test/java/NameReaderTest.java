import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex41.NameReader;

import java.util.ArrayList;
import java.util.List;

public class NameReaderTest {
    @Test
    public void fileReader() {
        NameReader reader = new NameReader();

        reader.fileReader();

        List<String> test = new ArrayList<String>();
        test.add("Ling, Mai");
        test.add("Johnson, Jim");
        test.add("Zarnecki, Sabrina");
        test.add("Jones, Chris");
        test.add("Jones, Aaron");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");

        assertEquals(test, reader.names);
    }

    @Test
    public void sort() {
        NameReader reader = new NameReader();

        reader.fileReader();
        reader.sort();

        List<String> test = new ArrayList<String>();
        test.add("Johnson, Jim");
        test.add("Jones, Aaron");
        test.add("Jones, Chris");
        test.add("Ling, Mai");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");
        test.add("Zarnecki, Sabrina");

        assertEquals(test, reader.names);
    }

}
