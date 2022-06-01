import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;
import org.junit.*;

public class MarkdownParseTest {

    /*
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test
    public void testForMarkdownParse() throws IOException{
        Path file = Path.of("test-file.md");
        String fileContent = Files.readString(file);
        List<String> expected = List.of("https://something.com", "some-page.html");
        
        assertEquals(expected, fileContent);
    }

    @Test
    public void testForMarkdownParseOne() throws IOException{
        Path file = Path.of("test-file1.md");
        String fileContent = Files.readString(file);
        List<String> expected = List.of("{}", "stringtester", "https://www.youtube.com");
        
        assertEquals(expected, fileContent);
    }
    */

    @Test
    public void test1() throws IOException{
        Path file = Path.of("snippet1.md");
        String fileContent = Files.readString(file);
        List<String> expected = List.of("google.com", "google.com", "ucsd.edu");
        
        assertEquals(expected, fileContent);
    }

    @Test
    public void test2() throws IOException{

        Path file = Path.of("snippet2.md");
        String fileContent = Files.readString(file);
        List<String> expected = List.of("a.com(())", "example.com");
        
        assertEquals(expected, fileContent);
    }

    @Test
    public void test3() throws IOException{
        Path file = Path.of("snippet3.md");
        String fileContent = Files.readString(file);
        List<String> expected = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        
        assertEquals(expected, fileContent);
    }
}


