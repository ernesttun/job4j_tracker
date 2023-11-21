package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> rsl = function.diapason(0, 5, x -> x * x);
        List<Double> excepted = Arrays.asList(0D, 1D, 4D, 9D, 16D);
        assertThat(rsl).containsAll(excepted);
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> rsl = function.diapason(0, 5, x -> Math.pow(x, x));
        List<Double> excepted = Arrays.asList(1D, 1D, 4D, 27D, 256D);
        assertThat(rsl).containsAll(excepted);
    }

}