import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Ctg {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(doubles = {30d, 45d, 60d})
    public void checkCtg(double d) {
        Assertions.assertEquals(1 / Math.tan(d), calc.ctg(d), 0.0001);
    }

    @AfterAll
    public static void end() {
        System.out.println(Ctg.class + " Tests finished");
    }
}
