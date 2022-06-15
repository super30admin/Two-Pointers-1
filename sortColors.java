// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No


import java.util.Arrays;

public class sortColors {
    public static void getSortColors(int[] A) {
        int n = A.length;
        int low = 0;
        int high = n - 1;
        int i = 0;

        while (i <= high) {
            if (A[i] == 0) {
                // Collecting all 0's at low
                swap(A, i, low);
                i++;
                low++;
            } else if (A[i] == 1) {
                i++;
            } else if (A[i] == 2) {
                // Collecting all 2's at high
                swap(A, i, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        getSortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
