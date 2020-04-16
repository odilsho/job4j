package array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MatrixCheck671Test {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck671.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {' ' , ' ', 'X'},
                {' ', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck671.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }
}