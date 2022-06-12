//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        if(nums == null || n == 0) return;

        int low = 0; 
        int high = n - 1; 
        int mid = 0; 

        while(mid <= high) 
        {
            if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                high--;
            }
            else 
            {
                mid++;
            }
        }
    }
    public void swap (int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 