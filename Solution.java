// Time compelxity: O(n)
// Space complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        
        // Edge case
        if( nums == null || nums.length == 0){
            return;
        }
        
        int left = 0;
        int cur = 0;
        int right = nums.length-1;
        
        while(cur <= right){
            if(nums[cur] == 0) {
                swap(nums, left, cur);
                cur++;
                left++;
            }
            else if(nums[cur] == 2){
                swap(nums, right, cur);
                right--;
            }
            else{
                cur++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
