// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Take 3 ptrs for each color. Then we iterate through array and swap to put colors in right place.
class SortColorsSolution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        int p0=0, p1=0, p2=nums.length-1;
        while(p1<=p2) {
            if(nums[p1] == 0) {
                swap(p0++, p1++, nums);
            } else if(nums[p1] == 2) {
                swap(p1, p2--, nums);
            } else {
                p1++;
            }
        }
        
    }
    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}