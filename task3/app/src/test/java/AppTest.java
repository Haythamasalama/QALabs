import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app = App.getInstance();

    @Test
    public void canThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> app.divide(1, 0));
    }

    @Test
    public void canThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> app.calculateCircleArea(0));
    }

    @Test
    public void canThrowArrayIndexOutOfBoundsException() {
        assertThrows(IllegalArgumentException.class, () -> app.calculateCircleArea(0));
    }

    @Test
    public void canHasOneInstance() {
        App app1 = App.getInstance();

        assertSame(app1,app);
        assertEquals(app1.hashCode(),app.hashCode());
    }
}
