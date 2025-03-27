import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort / sinkig sort / exchange sort
        // space complexity : O(1)
        // time complexity : O(n^2){worse case : sorted in opposite}
        int[] arr = { 5, 2, 8, 1, 9, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swapped = false;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
