import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    private static final ArrayList<String> OPERATOR = new ArrayList<>();
    static {
        OPERATOR.add("+");
        OPERATOR.add("-");
        OPERATOR.add("*");
        OPERATOR.add("/");
    }
    private double a = 0;
    private double b = 0;
    private final String operator;


    public Calculator(String entry1, String operator, String entry2) {
        try {
            this.a = Double.parseDouble(entry1);
            this.b = Double.parseDouble(entry2);
        } catch (NumberFormatException e) {
            System.out.print( "Invalid numbers");
        }
        if (a < 0) throw new NumberFormatException("First entry is negative");
        if (b < 0) throw new NumberFormatException("Second entry is negative");
        this.operator = operator;
    };

    public double calculate() {
        try {
            return switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> {
                    System.out.print("Error in switch");
                    yield 0;
                }
            };
        } catch (ArithmeticException e) {
            System.out.print("Cannot divide by zero");
        }
        return 0;
    }
}
