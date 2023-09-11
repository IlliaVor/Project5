package Part1Syntax;

import java.util.Scanner;

public class Part1Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers, please:");

        int num1 = getUserInput(in);
        int num2 = getUserInput(in);

        int sum = calculateSum(num1, num2);
        printResult("sum", num1, num2, sum);

        System.out.println("type two more values:");
        int value1 = getUserInput(in);
        int value2 = getUserInput(in);

        double product = calculateProduct(value1, value2);
        printResult("product", value1, value2, product);

        printMessage("Goodbye, World!");

        in.close();
    }

    public static int getUserInput(Scanner in) {
        return in.nextInt();
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static double calculateProduct(int x, int y) {
        return x * y;
    }

    public static void printResult(String operation, int num1, int num2, double result) {
        System.out.println("The " + operation + " of " + num1 + " and " + num2 + " is " + result);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}



