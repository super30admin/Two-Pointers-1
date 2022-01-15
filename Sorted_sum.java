// Time Complexity : O(n)
// Space Complexity : O(1)


class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        int mid = left;
        
        while (mid <= right){
            
            if (nums[mid] == 0){
                // Swap the mid and left elements
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                
                left++;
                mid++;
                
            }
            
            else if (nums[mid] == 2){
                
                // Swap the mid and right elements
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                
                right--;
            }
            
            else{
                mid++;
            }
            
        }
    }
}