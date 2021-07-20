class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        
        while(j <= k) {
            
            if(nums[j] == 2) {
                swap(nums, j, k);
                k--;
            } else if(nums[j] == 0) {
                swap(nums, j, i);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//Time: O(n)
//Space: O(1)
