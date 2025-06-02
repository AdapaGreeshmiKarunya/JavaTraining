import java.util.Arrays;
import java.util.Scanner;
public class PrintEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int sum=0;
        System.out.print("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i]; 
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\nSum of even numbers: " + sum);
        sc.close();
    }
}