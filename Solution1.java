// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {

        int p0 = 0;
        int p2 = nums.length-1;

        int curr = 0;

        while(curr<=p2){ //swap curr with p0 / p2 depending on value
            if(nums[curr]==0){
                swap(curr,p0,nums);
                p0++;
                curr++;
            }
            else if(nums[curr]==2){
                swap(curr,p2,nums);
                p2--;
            }else{
                curr++;
            }

        }

    }

    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}