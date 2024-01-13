import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Sin {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void checkSin() {
        Assertions.assertEquals(Math.sin(1d), calc.sin(1d), 0.0001);
    }

    @AfterAll
    public static void end() {
        System.out.println(Sin.class + " Tests finished");
    }
}
