package string_calculator;

import java.util.regex.Pattern;

public class Calculator {

    private static final Pattern regExp = Pattern.compile("^[0-9]*$");
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    public int calculate() {
        int result = 0;
        Operator currentOperator = Operator.PLUS;

        for (String data : expression.getExpression()) {
            if (regExp.matcher(data).find()) {
                result = currentOperator.operate(result, Integer.parseInt(data));
                continue;
            }
            currentOperator = Operator.findOperator(data);
        }
        return result;
    }
}
