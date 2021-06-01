package string_calculator;

import java.util.Scanner;

public class Input {

    public static String getStringValue(Scanner scanner) {
        String value = scanner.nextLine();
        return value;
    }

    public static String[] splitStringValues(String value) {
        String[] values = value.split(" ");
        return values;
    }
}
