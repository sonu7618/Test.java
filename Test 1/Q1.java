// Write a Java program that checks if the user input number is prime or composite.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 
        if (num <= 1) {
            System.out.println("The number is neither prime nor composite.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is a Composite number.");
            }
        }

        scanner.close();
    }
}
