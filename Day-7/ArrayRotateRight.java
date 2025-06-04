import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotateRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of right rotations: ");
        int d = scanner.nextInt();
        rotateArrayRight(arr, d);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }

    public static void rotateArrayRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}