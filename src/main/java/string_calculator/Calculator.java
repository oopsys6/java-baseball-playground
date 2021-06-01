package string_calculator;

public class Calculator {

    public static int calculator(int first, int second, String symbol) {
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
}
