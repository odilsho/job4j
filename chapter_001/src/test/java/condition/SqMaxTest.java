package condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void When4321Then4() {

        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));


    }

    @Test
    public void When102304Then30() {

        int result = SqMax.max(10, 2, 30, 4);
        assertThat(result, is(30));


    }

    @Test
    public void When4381Then8() {

        int result = SqMax.max(4, 3, 8, 1);
        assertThat(result, is(8));


    }

}