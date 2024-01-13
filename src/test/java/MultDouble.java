import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MultDouble {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.7d, 5.52d, 1.0098d})
    public void testMultiplyCorrect(double d) {

        Assertions.assertEquals(5.5*d, calc.mult(5.5d, d), 0.01);
    }

    @AfterAll
    public static void end() {
        System.out.println(MultDouble.class + " Tests finished");
    }
}
