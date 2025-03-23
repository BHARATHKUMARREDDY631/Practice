package practice;

public class PrintFirst100Primes {
    public static void main(String[] args) {
        int count = 0; // Counter for the number of primes found
        int num = 2;   // Starting number to check for primality
        System.out.println("First 100 prime numbers:");
        while (count < 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
