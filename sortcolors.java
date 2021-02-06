class Solution {
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
    */
    
    public void sortColors(int[] nums) {
        // check if nums is empty or not
        if(nums == null || nums.length == 0){
            return;
        }
        
        // 3 pointers
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        // keep traversing the array nums until curr exceeds right
        while(curr <= right){
            // if curr is 0 then
            if (nums[curr] == 0){
                // swap left and curr
                swap(nums, left, curr);
                // increment curr and left
                curr += 1;
                left += 1;
            }
            // if curr is 1 then
            else if (nums[curr] == 1){
                // increment curr
                curr += 1;
            }
            // if curr is 2 then
            else{
                // swap right and currr
                swap(nums, right, curr);
                // decrement right
                right -= 1;
            }
        }
    }
    // swap two numbers of the array nums
    private void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}