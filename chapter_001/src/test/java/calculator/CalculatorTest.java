package calculator;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void whenABThenSum() {
        double reuslt=Calculator.add(1,1);
        assertThat(reuslt,is(2d));

    }


}