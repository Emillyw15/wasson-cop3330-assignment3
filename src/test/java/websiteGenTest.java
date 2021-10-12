import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import ex43.websiteGen;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class websiteGenTest {
    @Test
    public void emptyTest() {
        String sitename = "awesome" + System.lineSeparator();
        String author = "wasson" + System.lineSeparator();
        String js = "n" + System.lineSeparator();
        String css = "n" + System.lineSeparator();
        InputStream sysIn = System.in;
        InputStream input = new ByteArrayInputStream((sitename + author + js + css).getBytes());
        System.setIn(input);

        websiteGen generator = new websiteGen();
        generator.generateSite();

        System.setIn(sysIn);
    }

    @Test
    public void jsTest() {
        String sitename = "awesome" + System.lineSeparator();
        String author = "wasson" + System.lineSeparator();
        String js = "y" + System.lineSeparator();
        String css = "n" + System.lineSeparator();
        InputStream sysIn = System.in;
        InputStream input = new ByteArrayInputStream((sitename + author + js + css).getBytes());
        System.setIn(input);

        websiteGen generator = new websiteGen();
        generator.generateSite();

        System.setIn(sysIn);
    }

    @Test
    public void cssTest() {
        String sitename = "awesome" + System.lineSeparator();
        String author = "wasson" + System.lineSeparator();
        String js = "n" + System.lineSeparator();
        String css = "y" + System.lineSeparator();
        InputStream sysIn = System.in;
        InputStream input = new ByteArrayInputStream((sitename + author + js + css).getBytes());
        System.setIn(input);

        websiteGen generator = new websiteGen();
        generator.generateSite();

        System.setIn(sysIn);
    }

    @Test
    public void makeIndex() {
        try {
            websiteGen index = new websiteGen();
            index.makeIndex();
            String name = "wasson";
            String site = "awesome";

            String content = Files.readString(Path.of("./website/awesome/index.html"));
            String template = "<!doctype html>\n"
                    + "<head>\n"
                    + "<meta name=\"author\" content=\"" + name + "\">"
                    + "</head>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "<title>" + site + "</title>\n"
                    + "</head>\n"
                    + "</html>";
            if (content.equals(template)) {
                assertTrue(true);
            }
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        }
    }
}
