// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Linear without space
/* Your code here along with comments explaining your approach: we need three pointers where each pointer intends to represent a color. The mid will
point to 1 and will carry out swaps. If the mid value is pointing at 2, shift 2 to the end and swap with high. Similarly, if mid == 0, swap it with left
to shift 0 to its correct positions, then its safe wh. If mid is 1, then increment the mid.
*/
class Solution {
    public void sortColors(int[] nums) {
       int low = 0 , high = nums.length-1,mid = 0;
       while(mid <= high){
           if(nums[mid] == 1){                          // If mid == 1, then mid moves to the next position
               mid++;
           } else if(nums[mid] == 2){                   // If mid is pointing at 2, shift it to right 
               swap(nums, mid, high);
               high--;                                  // high decrease post swap
           }
           else{
               swap(nums, mid,low);                     // Else shift it with the left
               low++;mid++;                             // Mid and low move towards the next
           }
       }
        
       }
    private void swap(int[] nums, int i , int j){           // Swap operation
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}