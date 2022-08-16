import solution.Task0;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Some tests for summing problem
 */
public class Task0Test {
    @Test
    public void check1() {
        int a = 5;
        int b = 10;
        Assert.assertEquals(15, Task0.solve(5, 10));
    }

    @Test
    public void check2() {
        int a = -5;
        int b = -20;
        Assert.assertEquals(-25, Task0.solve(-5, -20));
    }
}