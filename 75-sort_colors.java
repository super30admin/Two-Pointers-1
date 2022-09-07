//Approach-1: Using the sort function - which we shouldn't be using
//Approach-2: Count the occurances and place them in order based on count
//Approach-3: Using two-pointers, technically 3-pointers
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while(mid <= end){
            if(nums[mid] == 2){
                swap(nums, mid, end);
                end--;
            }else if(nums[mid] == 0){
                swap(nums, mid ,start);
                start++;
                mid++;
            }else{
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}