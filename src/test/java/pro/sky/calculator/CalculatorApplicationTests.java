package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.calculator.Controller.CalculatorController;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void calculatorTest() {
		assertEquals("error in add()", 3,  calculatorService(3, 0));
		assertEquals("error in add()", 2, calculatorService(1, 1));
		assertEquals("error in add()", 7, calculatorService(6, 1));
	}

    private Object calculatorService(int i, int i1) {
        return null;
    }

    public void calculatorAddFail() {
		assertEquals("error in add()", 0,  calculatorService(4, 2));
	}

	public void calculatorSubPass() {
		assertEquals("error in sub()", -1,  calculatorService(3, 0));
		assertEquals("error in sub()", 2,  calculatorService(1, 1));
		assertEquals("error in sub()", 4,  calculatorService(2, 1));
	}
	public void calculatorSubFail() {
		assertEquals("error in add()", 0, calculatorService(4, 2));
	}

}
