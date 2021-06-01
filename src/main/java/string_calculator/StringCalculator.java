package string_calculator;

import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] values = Input.getStringValues(scanner);

        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i + 1]);

            result = Calculator.calculator(result, second, symbol);
        }

        Output.print(result);
    }
}
