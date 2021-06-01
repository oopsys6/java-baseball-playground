package string_calculator;

import java.util.Scanner;

public class StringCalculator {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String value = Input.getStringValue(scanner);
        String[] values = Input.splitStringValues(value);

        int result = Calculator.calculate(values);

        Output.print(result);
    }

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.run();
    }
}
