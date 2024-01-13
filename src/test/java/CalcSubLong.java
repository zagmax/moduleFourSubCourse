import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcSubLong {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(longs = {10L, 5L, 1L})
    public void checkSub(long l) {
        Assertions.assertEquals(10L - l, calc.sub(10L, l));
    }

    @AfterAll
    public static void end() {
        System.out.println(CalcSubLong.class + " Tests finished");
    }
}
