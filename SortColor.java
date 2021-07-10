// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Two Pointer
class Solution {
    public void sortColors(int[] nums) {
    //edge case
        if(nums==null || nums.length==0) return;

        int l = 0;
        int r = nums.length-1;
        int c = 0;

        while(r>=c)
        {
            if(nums[c]==1)
            {
                c++; // current pointer increase
            }
            else if (nums[c]==2)
            {
                swap(nums,r,c);
                r--; // right boundry decrease
            }
            else{
                swap(nums,l,c);
                l++; // left boundry increase
                c++;
            }
        }
        
    }
private void swap(int[] nums, int p, int q)
{
    int temp = nums[p];
    nums[p] = nums [q];
    nums[q] = temp;
}
}