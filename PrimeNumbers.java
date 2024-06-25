import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimes(start, end);
    }

    private static void printPrimes(int num, int end) {
        if (num > end) {
            return;
        }

        if (isPrime(num)) {
            System.out.print(num + " ");
        }

        printPrimes(num + 1, end);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
