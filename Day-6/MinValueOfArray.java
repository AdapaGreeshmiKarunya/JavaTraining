public class MinValueOfArray {
    public static void main(String[] args) {
        int[] numbers = {4, 33, 29, 1, 5};
        int min = findMinValue(numbers);
        System.out.println("The minimum value in the array is: " + min);
    }
    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}