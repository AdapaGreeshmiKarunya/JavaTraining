import java.util.Scanner;
public class SumOfDigits {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int sum=0;
    for(int i=0;i<str.length();i++){
        sum+=str.charAt(i)-'0';
    }
    System.out.println("The sum of the digits is: " + sum);
   } 
}