import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String s = "A MAN , A PLAN , A CANAL: PANAMA";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        return cleaned.equals(sb.reverse().toString());
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(n + " is not a palindrome.");
            return;
        }
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n =n / 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }*/
}