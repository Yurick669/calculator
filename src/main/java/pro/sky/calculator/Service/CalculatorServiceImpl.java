package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


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
