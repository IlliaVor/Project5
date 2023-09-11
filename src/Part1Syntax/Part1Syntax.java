package Part1Syntax;

import java.util.Scanner;

public class Part1Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter 2 numbers pls: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        System.out.println("type 2 values: ");
        int value1 = in.nextInt();
        int value2 = in.nextInt();

        double product = multiply(value1, value2);
        printMessage("Hello, World!");


        System.out.println("Product: " + product);
    }


    public static void printMessage(String message) {
        System.out.println(message);
    }


    public static int add(int a, int b) {
        return a + b;
    }


    public static double multiply(double x, double y) {
        return x * y;
    }


    public static void myMethodNumberTwo() {
        System.out.println("Inside myMethodNumberTwo");
    }

    public static double myMethodNumberThree(int num) {
        System.out.println("Inside myMethodNumberThree");
        return num * 1.5;
    }

    public static void myMethod() {
        System.out.println("Inside myMethod");
        myMethodNumberTwo();
        double result = myMethodNumberThree(10);
        System.out.println("Result from myMethodNumberThree: " + result);
    }

    public static void myMethodNumber1() {
        System.out.println("Inside myMethodNumber1");
    }

    public static void myMethodNumber2() {
        System.out.println("Inside myMethodNumber2");
    }

    public static void myMethod2() {
        System.out.println("Inside myMethod2");
        myMethodNumber1();
    }
}

