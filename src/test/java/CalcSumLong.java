import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcSumLong {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void testSumIsCorrect() {
        Assertions.assertEquals(12L, calc.sum(6L, 6L));
    }

    @AfterAll
    public static void end() {
        System.out.println(CalcSumLong.class + " Tests finished");
    }
}
