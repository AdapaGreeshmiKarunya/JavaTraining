import java.util.Scanner;
public class MaximumAndMinimumFrequencyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxElem = arr[0], minElem = arr[0];
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxElem = arr[i];
                }
                if (freq[i] < minFreq) {
                    minFreq = freq[i];
                    minElem = arr[i];
                }
            }
        }
        System.out.println("Element with maximum frequency: " + maxElem + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with minimum frequency: " + minElem + " (Frequency: " + minFreq + ")");
    }
}