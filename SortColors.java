// Time Complexity : O(n) [single pass]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* We can count the no of 1's , 0's and and 2's by traversing through the array and rewrite with the count of 1 and 0's in the second pass.
But we cannot use 2 pass and sorting would not be optimal.so we use two pointer approach and use single pass.


*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums== null || nums.length ==0)return;
        //low helps placing 0 to right position in the array
        //high helps place 2 to right position in the array
        //mid helps place 1 to right position in the array 
        int low=0,high = nums.length - 1 , mid= 0;
        while(mid<=high){
            if(nums[mid]==0){
               swap(nums, mid,low);
                 low++; // we increment the low as we cannot have value on left which is not in place.
               mid++;
            }
            else if(nums[mid]==1){
                 mid++;
            }
            else{
                  swap(nums, mid,high);
                  //not moving mid here 
                  high--;

            }
        }
        
    }
    //swap logic
    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}