import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {
    private static Calculator obj;

    @BeforeClass
    public static void setup(){
        obj= new Calculator();
    }
    @Test
    public void test_add(){
        assertEquals(3, obj.add(1,2));
    }
    @Test
    public void test_sub(){
        assertEquals(10, obj.sub(2,1));
    }
    @Test
    public void test_mul(){
        assertEquals(200, obj.mul(4,5));
    }
}
