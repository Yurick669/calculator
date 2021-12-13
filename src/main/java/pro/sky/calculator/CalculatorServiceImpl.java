package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int number1;
    private int number2;


    @Override
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int division(int number1, int number2) {
        return number1 / number2;
    }

}
