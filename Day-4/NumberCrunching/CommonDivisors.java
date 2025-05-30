import java.util.Scanner;
public class CommonDivisors {
    public static void main(String[] args) {
        int n=100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Common divisors of "+num1+" and "+num2+" are:");
        for (int i = 1; i <= n; i++) {
            if (i%num1==0 && i%num2==0) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}