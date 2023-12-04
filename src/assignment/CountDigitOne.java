package assignment;
import java.util.Scanner;

public class CountDigitOne {
	public static int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Output
        System.out.println("Input: n = " + userInput);
        System.out.println("Output: " + countDigitOne(userInput));

        // Close scanner
        scanner.close();
    }
	

}
