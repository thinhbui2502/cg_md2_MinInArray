public class MinInArray {
    public static void main(String[] args) {
        int[] array = {2, 6, 9, 10, 1, 56, 42};
        int min = minValue(array);
        System.out.println("The smallest element in the array is: " + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
