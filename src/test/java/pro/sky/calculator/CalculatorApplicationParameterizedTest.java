package pro.sky.calculator;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import static org.junit.Assert.assertEquals;



public class CalculatorApplicationParameterizedTest {

    CalculatorServiceImpl out = new CalculatorServiceImpl();


    public static Stream<Arguments> sumTest() {
        return Stream.of(
                Arguments.of(8, 4, 12),
                Arguments.of(-10, 2, -8),
                Arguments.of(15, -5, 10),
                Arguments.of(1, 1, 2));

    }
    public static Stream<Arguments> subTest() {
        return Stream.of(
                Arguments.of(8, 4, 4),
                Arguments.of(-10, 2, -12),
                Arguments.of(15, -5, 20),
                Arguments.of(1, 1, 0));

    }
    public static Stream<Arguments> multiplicationTest() {
        return Stream.of(
                Arguments.of(8, 4, 32),
                Arguments.of(-10, 2, -20),
                Arguments.of(15, -5, -75),
                Arguments.of(1, 1, 1));

    }
    public static Stream<Arguments> divisionTest() {
        return Stream.of(
                Arguments.of(8, 4, 2),
                Arguments.of(-10, 2, -5),
                Arguments.of(15, -5, -3),
                Arguments.of(1, 1, 1));

    }

    @ParameterizedTest
    @MethodSource("sumTest")
    public void sumTest(int num1, int num2, int expected) {
        assertEquals(expected, out.sum(num1,num2));
    }


    @ParameterizedTest
    @MethodSource("subTest")
    public void subTest(int num1, int num2, int expected) {
        assertEquals(expected, out.subtraction(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("multiplicationTest")
    public void multiplicationTest(int num1, int num2, int expected) {
        assertEquals(expected, out.multiplication(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("divisionTest")
    public void divisionTest(int num1, int num2, int expected) {
        assertEquals(expected, out.division(num1,num2));
    }
}