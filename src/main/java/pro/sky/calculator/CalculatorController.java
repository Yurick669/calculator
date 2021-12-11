package pro.sky.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting () {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String sumNumbers(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.sum(number1,number2);
        return generateMessage(number1,number2,'+',result);
    }



    @GetMapping("/minus")
    public String subtractionNumbers(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.subtraction(number1, number2);
        return generateMessage(number1, number2, '-', result);
    }

    @GetMapping("/multiplication")
    public String multiplicationNumbers(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.multiplication(number1, number2);
        return generateMessage(number1, number2, '*', result);
    }
    @GetMapping("/division")
    public String divisionNumbers(@RequestParam int number1, @RequestParam int number2) {
        if (number2 == 0) {
            return "На 0 делить нельзя!";
        }
        int result = calculatorService.division(number1, number2);
        return generateMessage(number1, number2, '/', result);
    }


    private String generateMessage(int number1, int number2, char action, int result) {
        return "Ваше уравнение" + String.format("<h1>%d %c %d = %d</h1>", number1,action,number2,result);
    }

}
