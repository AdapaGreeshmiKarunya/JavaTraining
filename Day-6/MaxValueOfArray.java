public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] numbers = {4, 33, 29, 1, 5};
        int max = findMaxValue(numbers);
        System.out.println("The maximum value in the array is: " + max);
    }
    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}