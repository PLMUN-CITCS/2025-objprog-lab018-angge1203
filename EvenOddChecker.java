import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter an integer: ");

        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break; // Exit the loop if valid input is entered
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter an integer: ");
            }
        }
        
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        }
