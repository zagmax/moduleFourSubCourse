import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MultDouble {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void testMultiplyCorrect() {

        Assertions.assertEquals(15d, calc.mult(2.5d, 6d), 0.0000001);
    }

    @AfterAll
    public static void end() {
        System.out.println(MultDouble.class + " Tests finished");
    }
}
