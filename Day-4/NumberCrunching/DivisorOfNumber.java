import java.util.Scanner;
public class DivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        /*
        System.out.print("Divisors of "+number+" are: ");       
        for (int i=1; i<=number; i++) {
            if (number%i == 0) {
                System.out.print(i+" ");
            }
        }
        sc.close();*/

        int div=2;
        while(div<=number/2){
            if (number % div == 0) {
                System.out.print(div + " ");
            }
            div++;
        }
    }
}