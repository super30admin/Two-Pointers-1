public class SortColor {
// Time Complexity :O(n)
// Space Complexity :O(i)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :getting started

// Your code here along with comments explaining your approach

    class Solution {
        public void sortColors(int[] nums) {
            //base case
            if(nums.length == 0 || nums.length == 1) return;

            //declaring pointers
            int start = 0, end = nums.length-1, index = 0;

            //loop over array and sorrt array by having starting and ending pointers at the start and end of array
            // and swapping when value in array is 0 then increment start and index pointer, swap value when array
            //value is 2 and decrement ending pointer, else increment index pointer when value is one
            while(index<=end && start < end){
                if (nums[index] == 0){
                    nums[index] = nums[start];
                    nums[start] = 0;
                    start++;
                    index++;
                } else if(nums[index] == 2){
                    nums[index] = nums[end];
                    nums[end] = 2;
                    end--;
                } else {
                    index++;
                }
            }
        }
    }

}
