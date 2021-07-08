// Time Complexity :O(2N)~O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0) return;
        int r=0,w=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) r++;
            else if(nums[i]==1) w++;
            else b++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<r)nums[i]=0;
            else if(i<r+w)nums[i]=1;
            else nums[i]=2;
        }
    }
}