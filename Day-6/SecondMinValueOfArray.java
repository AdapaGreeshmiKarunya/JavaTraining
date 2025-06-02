public class SecondMinValueOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 33, 29, 1, 5};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum value found.");
        } else {
            System.out.println("Second minimum value: " + secondMin);
        }
    }
}