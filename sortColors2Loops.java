/**
 * time complexity is O(n)
 * space complexity is O(1)
 */

class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i < j) {
            if(nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else {
                i++;
            }
        }
        
        i = 0;
        
        while(i < j) {
            if(nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            else {
                j--;
            }
        }
         
    }
}