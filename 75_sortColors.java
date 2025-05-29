// Approach:
// This is the Dutch National Flag algorithm using three pointers: 
// l for the next position of 0, 
// mid for current element, and high for the next position of 2. 
// Iterate through the array, swapping elements to ensure all 0s are before l, all 2s after high, and 1s in the middle, adjusting pointers accordingly. 
// This sorts the colors (0, 1, 2) in a single pass without extra space.

// Time Complexity: O(n), because each element is processed at most once.
// Space Complexity: O(1), as sorting is done in-place without extra storage.




class Solution {
    public void sortColors(int[] nums) {
        int l=0,mid=0,high=nums.length-1;

        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            } else if(nums[mid] == 0){
                nums[mid] = nums[mid] + nums[l] - (nums[l]=nums[mid]);
                l++;mid++;
            } else{
                nums[high] = nums[high] + nums[mid] - (nums[mid] = nums[high]);
                high--;
            } 
        }
        return;
    }
}
