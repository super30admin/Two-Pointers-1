//TC : O(n)
//SC  :O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int p = 0;
        while(mid <= high) {
            if(nums[mid] == 2) {
                p = nums[high];
                nums[high] = nums[mid];
                nums[mid] = p;
                high--;
            }

            else if(nums[mid] == 0) {
                p = nums[low];
                nums[low] = nums[mid];
                nums[mid] = p;
                mid++;
                low++;
            }

            else
                mid++;
        }
            
    }
}
