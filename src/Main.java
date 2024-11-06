import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String entry1, operator, entry2;

        try ( Scanner scanner = new Scanner( System.in ) ) {

            System.out.print( "Veuillez saisir votre calcul : " );
            entry1 = scanner.next();
            operator = scanner.next();
            entry2 = scanner.next();

            Calculator calculator = new Calculator(entry1, operator, entry2);
            double result = calculator.calculate();
            if ((result % 1) == 0) {
                System.out.printf( "= %.0f\n", result );
            } else {
                System.out.printf( "= %.2f\n", result );
            }
        }
    }
}