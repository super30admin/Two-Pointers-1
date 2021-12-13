// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * we put low pointer at index 0 and high at index nums.length - 1.
 * Now in array there can be 0s, 1s and 2 in array.
 * now we iterate through array with index pointer.
 * If we encounter a 0, then we replace element at index with element at index low. Now increment bith low and index.
 * If we encounter a 2, then we replace element at index with element at index high. Now we only decrement high.
 * We countinue our loop till index <= high.
 * For 2, we only decrement high and not incrementing index because by replacing with high, if a 0 is coming at index, then we dont want to miss it. 
*/



class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)return;
        int low = 0;
        int high = nums.length -1;
        int index = 0;
      
        while (index <= high){
            if(nums[index] == 0){
                int temp = nums[low];
                nums[low] = nums[index];
                nums[index] = temp;
                low++;
                index++;
            }else if(nums[index] == 1){
                index++;
            }else{
                int temp = nums[index];
                nums[index] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}