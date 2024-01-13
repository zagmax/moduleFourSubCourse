import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PowCheck {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @Test
    public void checkPow() {
        Assert.assertEquals(Math.pow(2.5, 3), calc.pow(2.5, 3), 0.00001);
    }

    @AfterAll
    public static void end() {
        System.out.println(PowCheck.class + " Tests finished");
    }
}
