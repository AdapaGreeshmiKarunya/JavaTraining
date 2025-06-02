import java.util.Scanner;
import java.util.Arrays;
public class ProductOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int sizeA = sc.nextInt();
        int[] a = new int[sizeA];
        System.out.println("Enter elements of first array: ");
        for (int i = 0; i < sizeA; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int sizeB = sc.nextInt();
        int[] b = new int[sizeB];
        System.out.println("Enter elements of second array: ");
        for (int i = 0; i < sizeB; i++) {
            b[i] = sc.nextInt();
        }
        int maxSize = Math.max(sizeA, sizeB);
        int[] product = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            int valA = (i < sizeA) ? a[i] : 1;
            int valB = (i < sizeB) ? b[i] : 1;
            product[i] = valA * valB;
        }
        System.out.println("First array: " + Arrays.toString(a));
        System.out.println("Second array: " + Arrays.toString(b));
        System.out.println("Product array: " + Arrays.toString(product));
        sc.close();
    }
}