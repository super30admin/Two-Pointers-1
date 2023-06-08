// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        //using 3 pointers to keep track of 0,1,2   
        int l = 0;
        int mid =0;
        int r = n-1;
        while(mid<=r){
            int temp=0;
            //if mid is 2 then swap with r and decrement r. r becacuse we need to keep 2's at the end
            if(nums[mid]==2){
            temp = nums[r];
            nums[r] = nums[mid];
            nums[mid] = temp;
            r--;
        //if mid is 0 then swap with l and increment l. l becacuse we need to keep 0's at the start
        }else if(nums[mid] == 0){
            temp = nums[l];
            nums[l] = nums[mid];
            nums[mid] = temp;
            l++;
            mid++;
            //if mid is 1 then just increment mid because we gonna swap it with l in the next iteration
        }else{
            mid++;
        }

        }
    }
}