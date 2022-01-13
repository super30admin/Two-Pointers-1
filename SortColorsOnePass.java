// TwoPass
// https://leetcode.com/submissions/detail/619030057/
// Time - O(n)
// Space - O(1) 

class Solution {
    public void sortColors(int[] nums) {
        
        int[] colors = {0, 1, 2};
        int i = 0, j = 0;
        
        for(int k = 0; k < colors.length; k++) {
            
            j = i;
            while(j < nums.length) {
                
                if(colors[k] == nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    
                    i++;
                }
                j++;
            }
        }
    }
}