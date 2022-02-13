package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.calculator.Service.CalculatorService;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	CalculatorServiceImpl out = new CalculatorServiceImpl();

	@Test
	public void calculatorTestSum() {
		assertEquals("error in add()", 5, out.sum(3, 2));
		assertEquals("error in add()", 12, out.sum(9, 3));
		assertEquals("error in add()", 6, out.sum(4, 2));

	}

	@Test
	public void calculatorTestSub() {
		assertEquals("error in add()", 1, out.subtraction(6, 5));
		assertEquals("error in add()", 2, out.subtraction(8, 6));
		assertEquals("error in add()", 2, out.subtraction(4, 2));


	}

	@Test
	public void calculatorTestMultiplication() {
		assertEquals("error in add()", 18, out.multiplication(6, 3));
		assertEquals("error in add()", 27, out.multiplication(9, 3));
		assertEquals("error in add()", 8, out.multiplication(4, 2));
	}

	@Test
	public void calculatorTestDivision() {
		assertEquals("error in add()", 2, out.division(6, 3));
		assertEquals("error in add()", 3, out.division(9, 3));
		assertEquals("error in add()", 2, out.division(4, 2));
	}



}
