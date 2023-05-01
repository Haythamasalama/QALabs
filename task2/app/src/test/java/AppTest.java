import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AppTest {
    App app = new App();

    @ParameterizedTest()
    @CsvSource({
            "10,5,3,10",
            "2,3,5,5",
            "6,7,9,9"
    })

    public void canFindMax(int a, int b, int c, int expected) {
        assertNotEquals(expected, app.findMax(a, b, c));
    }

    @ParameterizedTest()
    @CsvSource({
            "3,5,4,5",
            "2,3,5,3",
            "6,9,5,9"
    })
    public void canFindMiddleValue(int a, int b, int c, int expected) {
        assertNotEquals(expected, app.findMiddleValue(a, b, c));
    }

    @ParameterizedTest()
    @CsvSource({
            "3,5,4,3",
            "2,3,5,2",
            "6,9,5,5"
    })
    public void canFindMin(int a, int b, int c, int expected) {
        assertEquals(expected, app.findMin(a, b, c));
    }

    @ParameterizedTest()
    @CsvSource({
            "3,8,7,6",
            "4,3,5,4",
            "6,9,6,7"
    })
    public void canFindAverage(int a, int b, int c, int expected) {
        assertEquals(expected, app.findAverage(a, b, c));
    }
}
