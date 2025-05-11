import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator expression = new SimpleCalculator();

        Scanner inputUser = new Scanner(System.in);


        expression.addition(inputUser);
        expression.subtraction(inputUser);
        expression.multiplication(inputUser);
        expression.division(inputUser);

    }
}
