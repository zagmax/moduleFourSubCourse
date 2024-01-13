import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DivLong {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void testDivideByZero() {

        try {
            calc.div(1L, 0L);
            Assertions.fail("main must throw an exception");
        } catch (Exception e) {
            Assertions.assertEquals(NumberFormatException.class, e.getClass());
            Assertions.assertEquals("Attempt to divide by zero", e.getMessage());
        }
    }

    @Test
    public void testDivideCorrectResult() {
        Assertions.assertEquals(2L, calc.div(6L, 3L));
    }

    @AfterAll
    public static void end() {
        System.out.println(DivLong.class + " Tests finished");
    }
}
