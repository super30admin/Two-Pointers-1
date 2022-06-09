// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//dutch flag, sorting the colours, 2 pass
public class Problem1 {
    public void sortColors(int[] nums) {

        int n = nums.length;
        if (n == 0 || n == 1)
            return;
        int low = 0;
        int high = n - 1;

        while (true) {//sorts zeros

            while (nums[low] == 0 && low < n - 1)
                low++;
            while (nums[high] != 0 && high > 0)
                high--;

            if (low > high)
                break;

            exch(nums, low, high);

            if (low < n - 1)
                low++;
            if (high > 0)
                high--;
        }

        low = 0;
        high = n - 1;
        while (true) {//sorts the remaining

            while ((nums[low] == 1 || nums[low] == 0) && low < n - 1)
                low++;
            while (nums[high] != 1 && high > 0)
                high--;

            if (low > high)
                break;

            exch(nums, low, high);

            if (low < n - 1)
                low++;
            if (high > 0)
                high--;
        }
    }

    private void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

}
