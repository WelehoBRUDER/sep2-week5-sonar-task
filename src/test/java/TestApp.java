import org.example.App;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {

    @Test
    void main() {
        String[] args = {};
        String mockData = "4\n";
        ByteArrayInputStream mockInput = new ByteArrayInputStream(mockData.getBytes());
        System.setIn(mockInput);
        App.main(args);
    }

    @Test
    void testFindInt() {
        String mockData = "8\n";
        ByteArrayInputStream mockInput = new ByteArrayInputStream(mockData.getBytes());
        System.setIn(mockInput);
        int num = App.findInt();
        assertEquals(8, num);
    }

    @Test
    void testIterateLoop() {
        App.iterateLoop(1, 3);
    }
}
