// Name: Rithikaa Redde
// PRN: 23070126101
// Batch: AIML - B1

import java.util.Scanner;

public class UserInput {
    // Get the calculation choice from the user
    public int getCalculationChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of Array");
        System.out.println("7. Variance of Array");
        return scanner.nextInt();
    }

    // Get array input from the user
    public double[] getArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        double[] numbers = new double[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }
        return numbers;
    }

    // Get a single number input from the user
    public int getSingleNumberInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }
}
