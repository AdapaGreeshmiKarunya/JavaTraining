public class SecondMaxValueOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 33, 29, 1, 5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum value found.");
        } else {
            System.out.println("Second maximum value: " + secondMax);
        }
    }
}