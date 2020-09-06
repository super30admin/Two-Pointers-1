// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
For each element that we traverse in nums, keep two pointers left and right. Left places the 0's in place and right places the 1's in place
If our current element is 2, then we swap with elemnt in the rigth index and decement right.
If our current index is now 0, then we swap with the left index and incremenet both current and left. If it is 1, just increment current.

*/


class SortColor {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums==null || nums.length == 1){
            return;
        }
        int current =0;
        int left = 0;
        int right = nums.length -1;
        
        while(current <= right){
            //If our current element is 2, then we swap with elemnt in the rigth index and decement right.
            if(nums[current] == 2){
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
                right--; //decerement only right, as our current index might require further swaps
            }
            //If our current index is now 0, then we swap with the left index and incremenet both current and left. 
            if(nums[current] == 0){
                int temp = nums[current];
                nums[current] = nums[left];
                nums[left] = temp;
                left++;
                current++;
                //If it is 1, just increment current.
            }else if(nums[current] == 1){
                current++;
            }
            
        }
        
    }
}