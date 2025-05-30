import java.util.Scanner;
public class Lcm {
    /*     public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lcm =(num1*num2)/gcd(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    } */
   // This code calculates the LCM of two numbers (12 and 18) using a brute force method.
   public static void main(String[] args) {
    int n1=12;
    int n2=18;
    int max=(n1>n2)?n1:n2;
    while (true) {
      if(max%n1==0 && max%n2==0){
        System.out.println(max);
        break;
      }
    max++;
    }
}
}