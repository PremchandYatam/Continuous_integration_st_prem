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
    public void test_add(){assertEquals(3,obj.add(1,2));}
}
