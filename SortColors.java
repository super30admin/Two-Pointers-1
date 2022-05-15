// Time Complexity : O(n) n is nums length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int l=0, m=0, h=nums.length-1;
        while(m<=h){
            if(nums[m] == 2){
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            } else if(nums[m] == 0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            } else
                m++;
        }
    }
}
