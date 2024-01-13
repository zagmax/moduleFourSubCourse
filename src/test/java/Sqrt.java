import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Sqrt {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(doubles = {10d, -5d, 0d})
    public void checkSqrt(double d) {
        Assertions.assertEquals(Math.sqrt(d), calc.sqrt(d), 0.0001);
    }

    @AfterAll
    public static void end() {
        System.out.println(Sqrt.class + " Tests finished");
    }
}
