//Time Complexity: O(N) where N is the length of nums
//Space Complexity: O(1)

//Successfully run on leetcode? : Yes (Time: O ms)

//Approach: Here, we are using three different pointers - low (to collect all 0s), mid (to collect all 1s) and high (to collect
// all 2's) and make necessary swaps as well as move the pointers such that we get all the 0's in the beginning, followed
// by 1's and 2's.



class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int low = 0; int mid = 0; int high = nums.length - 1;
        
        while(mid <= high)
        {
            if(nums[mid] == 1)
                mid++;
            else if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                low++; mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, high, mid);
                high--;
            }
        }
    }
    
    public void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}