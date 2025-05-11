import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {



    public void addition(Scanner inputUser) {

        double num1;
        double num2;
        double sum;

        System.out.println("Please enter your first number: ");

        while (true) {

            try {

                num1 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        System.out.println("Thank you! Now enter your second number: ");

        while (true) {

            try {

                num2 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is equal to " + sum);

    }

    public void subtraction(Scanner inputUser) {

        double num1;
        double num2;
        double difference;

        System.out.println("Please enter your first number: ");

        while (true) {

            try {

                num1 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        System.out.println("Thank you! Now enter your second number: ");

        while (true) {

            try {

                num2 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is equal to " + difference);

    }

    public void multiplication(Scanner inputUser) {

        double num1;
        double num2;
        double product;

        System.out.println("Please enter your first number: ");

        while (true) {

            try {

                num1 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        System.out.println("Thank you! Now enter your second number: ");

        while (true) {

            try {

                num2 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is equal to " + product);
    }

    public void division(Scanner inputUser) {

        double num1;
        double num2;
        double quotient;

        System.out.println("Please enter your first number: ");

        while (true) {

            try {

                num1 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        System.out.println("Thank you! Now enter your second number: ");

        while (true) {

            try {

                num2 = inputUser.nextDouble();
                Double.valueOf(num1);
                break;
            }
            catch (InputMismatchException nfe) {
                System.out.println("You haven't entered a number, please try again: ");
                inputUser.nextLine();
            }
        }

        quotient = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is equal to " + quotient);
    }
}
