import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }
    }
    public static boolean isPowerOfTwo(int n) {
        // Alternative method using bit manipulation
        /*if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;*/
        return n > 0 && (n & (n - 1)) == 0; // Efficient bit manipulation method
    }
}