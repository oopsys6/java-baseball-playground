package string_calculator;

public class Main {

    public static void main(String[] args) {
        String value = Input.inputData();
        Calculator calculator = new Calculator(new Expression(value));
        int result = calculator.calculate();
        System.out.println("result : " + result);
    }
}
