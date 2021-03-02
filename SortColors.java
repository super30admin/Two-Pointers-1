// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortColors {
    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0)
                swap(low++, mid++, nums);
            else if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 2)
                swap(mid, high--, nums);
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        Collections.addAll(inputs, new int[] { 2, 0, 2, 1, 1, 0 }, new int[] {}, new int[] { 2, 0, 1 });

        for (int[] nums : inputs) {
            sortColors(nums);
            System.out.println(Arrays.toString(nums));
        }
    }
}
