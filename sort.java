// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int l =0 , m =0, h = nums.length -1;
        
        while(m <= h){
            if(nums[m] == 2){
                swap(nums,m, h);
                h = h -1;
            }
            else if(nums[m] == 1){
            m = m + 1;    
            }
            else{
                swap(nums, m, l);
                l = l + 1;
                m = m + 1;
            }
        }
        

    }
            private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}