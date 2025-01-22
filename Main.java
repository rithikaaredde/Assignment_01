import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        UserInput input = new UserInput();  // Fixed class name from Input to UserInput

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci series");
            System.out.println("6. Sum of array");
            System.out.println("7. Mean of array");
            System.out.println("8. Mode of array");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Addition
                    System.out.println("Sum is: " + calc.calculateSum(input.getArrayInput()));  // Fixed method call
                    break;
                case 2: // Subtraction
                    System.out.println("Difference is: " + calc.calculateDiff(input.getArrayInput()));  // Fixed method call
                    break;
                case 3: // Multiplication
                    System.out.println("Product is: " + calc.calculateProduct(input.getArrayInput()));  // Fixed method call
                    break;
                case 4: // Division
                    System.out.println("Quotient is: " + calc.calculateQuotient(input.getArrayInput()));  // Fixed method call
                    break;
                case 5: // Fibonacci
                    System.out.print("Enter the number of terms for Fibonacci series: ");
                    int n = scanner.nextInt();
                    calc.fibonacci(n);
                    break;
                case 6: // Sum of Array
                    System.out.println("Sum of array is: " + calc.sumOfArray(input.getArrayInput()));  // Fixed method call
                    break;
                case 7: // Mean of Array
                    System.out.println("Mean of array is: " + calc.meanOfArray(input.getArrayInput()));  // Fixed method call
                    break;
                case 8: // Mode of Array
                    System.out.println("Mode of array is: " + calc.modeOfArray(input.getArrayInput()));  // Fixed method call
                    break;
                case 9: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
