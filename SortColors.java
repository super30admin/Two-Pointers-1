// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Use Two pointers approach, we use 3 pointers here for sorting 3 colors, low and mid at 0 and high at last index.
 * We consider 2 cases: where value is 2 or 0; if nums is 2 where swap it with high and move high as we have set it right with 2.
 * where value is 0 we swap it with low and move low. We move mid here as well because we know left side will be sorted and 
 * whatever number comes in swap we know that it will be taken care of. Else we increment mid.
 */

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length < 1) {
            return;
        }
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
        return;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return;
    }
}
