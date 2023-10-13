// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int l = 0, m = 0, r = n - 1;

            while(m <= r){
                if(nums[m] == 1){
                    m++;
                }
                else if(nums[m] == 0){
                    swap(nums, m, l);
                    l++;
                    m++;
                }
                else{
                    //nums[mid] == 2
                    swap(nums, m, r);
                    r--;
                }
            }
        }

        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
