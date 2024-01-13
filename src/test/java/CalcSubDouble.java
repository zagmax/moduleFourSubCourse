import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcSubDouble {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
    }

    @ParameterizedTest
    @ValueSource(doubles = {10d, 5d, 1d})
    public void checkSub(double d) {
        Assertions.assertEquals(10d - d, calc.sub(10d, d));
    }

    @AfterAll
    public static void end() {
        System.out.println(CalcSubDouble.class + " Tests finished");
    }
}
