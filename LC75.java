// TC: O(n)
// SC: O(1)

public class LC75 {
    public void swap(int nums[], int i, int j) {
        if (nums[i] == nums[j])
            return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int s = 0, e = n - 1, i = 0;
        while (i <= e) {
            if (nums[i] == 0)
                swap(nums, i++, s++);
            else if (nums[i] == 2)
                swap(nums, i, e--);
            else
                i++;
        }
    }
}