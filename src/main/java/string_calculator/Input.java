package string_calculator;

import java.util.Scanner;

public class Input {

    public static String[] getStringValues(Scanner scanner) {
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        return values;
    }
}
