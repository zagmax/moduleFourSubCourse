import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Execution(ExecutionMode.CONCURRENT)
public class CalcSumDoubleParallelExec {
    static Calculator calc;

    @BeforeAll
    public static void preparation() {
        calc = new Calculator();
        System.out.println("Tests started");
    }

    @ParameterizedTest
    @ValueSource(doubles = {10d, 5d, 1d})
    public void checkSum(double d) {
        Assertions.assertEquals(10d + d, calc.sum(10d, d));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0d, 3d, 7d})
    public void checkSum2(double d) {
        Assertions.assertEquals(10d + d, calc.sum(10d, d));
    }

    @ParameterizedTest
    @ValueSource(doubles = {11.5d, 12.5d, 13.5d})
    public void checkSum3(double d) {
        Assertions.assertEquals(10d + d, calc.sum(10d, d));
    }

    @AfterAll
    public static void end() {
        System.out.println(CalcSumDoubleParallelExec.class + " Tests finished");
    }

}
