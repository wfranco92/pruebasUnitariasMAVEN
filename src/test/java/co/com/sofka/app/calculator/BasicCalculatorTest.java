package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing rest")
    public void rest(){

        Long number1 = 13L;
        Long number2 = 5L;

        Long expectativeValue = 8L;

        Long result = basicCalculator.rest(number1, number2);

        assertEquals(expectativeValue, result);
    }


    @DisplayName("Testing several rests")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "5,     6,   -1",
            "11,    2,    9",
            "49,    9,   40",
            "101,  100,   1",
            "23,    19,   4"
    })
    public void severalRests(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.rest(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    public void mult(){

        Long number1 = 6L;
        Long number2 = 8L;

        Long expectativeValue = 48L;

        Long result = basicCalculator.mult(number1, number2);

        assertEquals(expectativeValue, result);
    }

    @DisplayName("Testing several mults")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "5,     6,   30",
            "11,    2,    22",
            "9,     9,   81",
            "10,  100,   1000",
            "2,    9,   18"
    })
    public void severalMults(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mult(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    public void div(){
        Long number1 = 10L;
        Long number2 = 2L;

        Long expectativeValue = 5L;

        Long result = basicCalculator.div(number1, number2);

        assertEquals(expectativeValue, result);
    }

    @DisplayName("Testing several mults")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "12,     6,   2",
            "32,    2,    16",
            "9,     9,   1",
            "100,  10,   10",
            "9,    3,   3"
    })
    public void severalDivs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
