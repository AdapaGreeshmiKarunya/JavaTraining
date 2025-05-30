import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* int count = 0; */
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Number of Digits in " + number + " is: ");
        /*while(number!=0) {
            number=number/10;
            count++;*/
        System.out.println((int) Math.log10(number)+1);
    }
}