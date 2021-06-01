package string_calculator;

public class Calculator {

    private static int calculatePartial(int first, int second, String symbol) {
        int result = 0;
        if (symbol.equals("+")) {
            result = first + second;
        } else if (symbol.equals("-")) {
            result = first - second;
        } else if (symbol.equals("*")) {
            result = first * second;
        } else if (symbol.equals("/")) {
            result = first / second;
        } else {
            System.out.println("사친 연산이 아닙니다.");
        }
        return result;
    }

    public static int calculate(String[] values) {
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String symbol = values[i];
            int second = Integer.parseInt(values[i + 1]);

            result = Calculator.calculatePartial(result, second, symbol);
        }
        return result;
    }
}
