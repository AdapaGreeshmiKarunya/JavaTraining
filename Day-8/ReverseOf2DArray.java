import java.util.Scanner;
import java.util.Arrays;
public class ReverseOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1 - j] = temp;
            }
        }
        System.out.println("Reversed 2D array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}