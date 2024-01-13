import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NegativeCheck {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(longs = {-1L, -5L})
    public void testNegativeResult(long d) {
        Assertions.assertTrue(calc.isNegative(d));
    }

    @ParameterizedTest
    @ValueSource(longs = {0L, 5L})
    public void testPositiveNumbers(long d) {
        Assertions.assertFalse(calc.isNegative(d));

    }

    @AfterAll
    public static void end() {
        System.out.println(NegativeCheck.class + " Tests finished");
    }
}
