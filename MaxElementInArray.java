public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,4,10};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}