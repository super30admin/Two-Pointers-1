// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public void sortColors(int[] nums) {
        int p0=0;
        int p2=nums.length-1;
        int curr=0;
        while(curr<=p2){
            if(nums[curr]==0){
                nums[curr]=nums[p0];
                nums[p0]=0;
                p0++;
                curr++;
            }
            else
            if(nums[curr]==2){
                nums[curr]=nums[p2];
                nums[p2]=2;
                p2--;
            }
            else curr++;
        }
    }
}