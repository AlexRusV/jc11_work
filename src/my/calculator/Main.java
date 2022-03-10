package my.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operationCount = 0;
        while (operationCount < 10) {
            // Abstract level 1
            Arguments arguments = readArguments();
            doCalculation(arguments);
            checkExitOrContinue();
            operationCount++;
        }
    }

    private static Arguments readArguments() {
        //Abstract level 2
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter operation: ");
        String operation = scanner.next();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        return new Arguments(firstNumber, operation, secondNumber);
    }

    private static void doCalculation(Arguments args) {
        //Abstract level 2
        BasicCalculator abcd = new BasicCalculator();
        double result =
                abcd.calculate(args.num1, args.num2, args.operation.charAt(0));
        System.out.println("Result of " + args.num1
                + args.operation.charAt(0) + args.num2 + " is " + result);
    }

    private static void checkExitOrContinue() {
        System.out.print("Please enter [E] to exit or any key to continue: ");
        String command = new Scanner(System.in).next();
        if (command.equalsIgnoreCase("E")) {
            System.exit(0);
        }
    }
}