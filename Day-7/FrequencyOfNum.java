import java.util.Scanner;
public class FrequencyOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find its frequency: ");
        int num = sc.nextInt();
        int frequency = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                frequency++;
            }
        }
        System.out.println(num + " comes " + frequency + (frequency == 1 ? " time" : " times"));
    }
}