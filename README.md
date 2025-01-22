# Assignment_01 - Java Calculator Program


This repository contains the code for a simple Calculator program written in Java. The program includes basic arithmetic operations, 
Fibonacci sequence generation, and calculations like mean, sum, and mode of arrays.


- Main.java: The entry of the program, which gives a menu to the user and processes their input.
- UserInput.java: Contains methods for receiving user input, both single number and array input.
- Calculator.java: Contains the methods that handle the calculations.

## Methods and Functions

## `Main.java`
- **`main(String[] args)`**: 
    - The entry point of the program. It displays a menu to the user with various options and calls the respective methods
      from `Calculator` and `UserInput` classes based on the user's choice.
    - Loop continues until the user chooses to exit the program.

## `UserInput.java`
- `getCalculationChoice()`:
    - Prompts the user to select an operation (addition, subtraction, multiplication, etc.).
    - Returns the selected choice as an integer.

- `getArrayInput()`:
    - Prompts the user to enter the size of the array and then the elements of the array.
    - Returns the array of numbers entered by the user.

- `getSingleNumberInput()`:
    - Prompts the user to input a single number.
    - Returns the entered number as an integer.

## `Calculator.java`
- `calculateSum(int[] numbers)`:
    - Takes array of two integers and returns the sum of those numbers.

- `calculateDiff(int[] numbers)`:
    - Takes array of two integers and returns the difference.

- `calculateProduct(int[] numbers)`:
    - Takes array of two integers and returns their product.

- `calculateQuotient(int[] numbers)`:
    - Takes an array of two integers and returns their quotient 
    - Handles division by zero and displays an error message and returning 0 if division by zero is attempted.

- `fibonacci(int n)`:
    - Generates and prints the Fibonacci sequence up to `n` terms.
    - If `n` is less than or equal to 0, it prints an error message.

- `sumOfArray(int[] array)`:
    - Takes integer array and returns the sum of all its elements.

- `meanOfArray(int[] array)`:
    - Takes integer array and returns the mean 
    - If the array is empty, it prints an error message and returns 0.

- `modeOfArray(int[] array)`:
    - Takes integer array and returns the mode of the array.
    - If the array is empty, it prints an error message and returns -1.


