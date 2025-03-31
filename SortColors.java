// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
The problem requires sorting an array of 0s, 1s, and 2s without using extra space, so we need an efficient in-place approach.
The key intuition is to use three pointers: left to track 0s, right to track 2s,
and mid to traverse the array. If we encounter a 0, we swap it to the left;
if we see a 2, we push it to the right, and if it's a 1, we simply move forward.
Since each number is processed at most once, this approach ensures a single-pass O(n) solution.
This method efficiently places all numbers in their correct positions while maintaining a stable
traversal

*/
class SortColors {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length - 1;
        while(mid<=right)
        {
            if(nums[mid]==2)
            {
                int temp=nums[right];
                nums[right]=nums[mid];
                nums[mid]=temp;
                right--;
            }
            else if(nums[mid]==0)
            {
                int temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
        }
    }
}