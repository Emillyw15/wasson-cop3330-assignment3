import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex42.parsingData;

import java.util.ArrayList;
import java.util.List;

public class parsingDataTest {
    @Test
    public void fileReader() {
        parsingData reader = new parsingData();

        reader.fileReader();

        List<String> test = new ArrayList<String>();
        test.add("Ling,Mai,55900");
        test.add("Johnson,Jim,56500");
        test.add("Jones,Aaron,46000");
        test.add("Jones,Chris,34500");
        test.add("Swift,Geoffrey,14200");
        test.add("Xiong,Fong,65000");
        test.add("Zarnecki,Sabrina,51500");

        assertEquals(test, reader.names);
    }

}
