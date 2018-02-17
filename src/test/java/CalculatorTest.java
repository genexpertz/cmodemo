import com.cdit.cmo.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 17/02/18.
 */

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator var1 = new Calculator();
        Assert.assertEquals("add method returned wrong value",30, var1.add(10,20));
    }

    @Test
    public void testAddUsingConstructor() {
        Calculator var1 = new Calculator(10, 20);
        Assert.assertEquals("add method returned wrong value",30, var1.add());
    }


}
