// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Approach:
// 1. Maintain 3 pointers - i, low, high. low, i starting at 0 and high starting from end.
// 2. Move over i and high indices and swap i with either high or low based on value at i index.
// 3. The main idea is that 0 is present at low index, 1 at i and 2 at high index.
// 4. Whenever i and high cross eachother, terminate


class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int i = 0, low = 0, high = nums.length - 1, temp;
        while(i <= high) {
            if(nums[i] == 0) {
                temp = nums[low];
                nums[low] = nums[i];
                nums[i] = temp;
                low++; i++;
            }
            else if(nums[i] == 2) {
                temp = nums[high];
                nums[high] = nums[i];
                nums[i] = temp;
                high--;
            }
            else {
                i++;
            }
        }
    }
}