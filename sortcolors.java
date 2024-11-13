// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//approach: took 3 pointers: low for moving 0 to left most location in array,high
//for moving 2 to right most in the array and mid keeps all the 1s in the middle.

// Your code here along with comments explaining your approach

public class sortcolors {
    class Solution {
        public void sortColors(int[] nums) {
            int n=nums.length;
            int low=0,high=n-1;
            int mid=0;
            while(mid<=high)
            {
                if(nums[mid]==2)
                {
                    swap(nums,mid,high);
                    high--;
                }
                else if(nums[mid]==0)
                {
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                else
                    mid++;
            }
            //return nums;
        }
        public void swap(int[] nums,int a,int b)
        {
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    }
}
