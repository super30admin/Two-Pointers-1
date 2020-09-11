Time Complexity: O(n)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while(mid <= high){
            if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
            }
            if(nums[mid] != 2)
                mid++;
        }
    }
}
