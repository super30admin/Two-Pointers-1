// Time Complexity : O(N) - N is size of the array
// Space Complexity : O(1) - No additional data structure is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] nums) {
        int curr = 0,p1 = 0,p2 = nums.length - 1;
        while(curr <= p2){
            if(nums[curr] == 0){
                int temp = nums[p1];
                nums[p1] = nums[curr];
                nums[curr] = temp;
                p1++;
                curr++;
            }
            else if(nums[curr] == 2){
                int temp1 = nums[p2];
                nums[p2] = nums[curr];
                nums[curr] = temp1;
                p2--;
            }
            else if(nums[curr] == 1){
                curr++;
            }
        }
    }
}

// Your code here along with comments explaining your approach