// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        //approach1 TC: O(n) SC:O(1) --- counts 1,2,0 and put it in array 
        //Approach2 TC: O(nlogn) SC:O(1) --- Arrays.sort();

        //approach3 TC: O(n) SC:O(1)
        if(nums == null || nums.length == 0) return;
        int ptr0 = 0;
        int curr = 0;
        int n =  nums.length;
        int ptr2 = n-1;
        int tmp = 0;
        while(curr<=ptr2){
            if(nums[curr] ==2){
                tmp = nums[ptr2];
                nums[ptr2] = nums[curr];
                nums[curr] = tmp;
                ptr2--;
            }else if(nums[curr] == 0){
                tmp = nums[curr];
                nums[curr] = nums[ptr0];
                nums[ptr0] = tmp;
                ptr0++;
                curr++;
            }else{
                curr++;
            }
        }
        return ;
    }
}