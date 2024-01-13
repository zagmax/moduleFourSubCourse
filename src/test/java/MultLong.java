import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MultLong {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void testMultiplyCorrect() {
        Assertions.assertEquals(10, calc.mult(2, 5));
    }

    @AfterAll
    public static void end() {
        System.out.println(MultLong.class + " Tests finished");
    }
}
