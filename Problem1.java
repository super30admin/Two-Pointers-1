// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the length of the given array

// Your code here along with comments explaining your approach
    //We maintain 3 pointers, one pointer for each number, with names "low", "mid" & "high". 
    //We initialize "low" and "mid" with 0 and "high" with length-1. When mid is pointing at "0", we swap it with low and move both the pointers. When its at "2", we swap it with high and decrement high.
    //When we are at "1", we just increment mid. In this way, we keep moving the pointers to next element until mid and high meet. Then we will end up with a sorted array.

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid<=high)
        {
            if (nums[mid]==0)
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}