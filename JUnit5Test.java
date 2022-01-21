import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5Test {
        
    @Test
    void helloJUnit5() {
        assertEquals(10, 5+5);
    }
}