import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySearchTest{
    private final int[] x = {5,12,15,4,8,12,7};

    @Test
    public void firstElement(){
        assertEquals("5 not at position 0", 0, ArraySearch.search(x, 5));
    }

    public static void main(String[] args) 
    {
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(ArraySearchTest.class);
    }
}