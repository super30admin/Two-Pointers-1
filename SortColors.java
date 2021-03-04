// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*Using two pointer approach, we take three pointers, one to iterate and two others to check with if the values are placed front and last.
The left pointer is swapped if the iterating variable is equal to 0 since 0's should be placed to the left.
The right pointer is swapped if the iterating variable is equal to 2 since 2's should be placed to the right.
*/

// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int start=0,i=0,end = nums.length-1;
        while(i<=end){
            if(nums[i] == 2){
                swap(nums,i,end);
                end--;
            }
            else if(nums[i] == 0){
                swap(nums,i,start);
                start++;
                i++;
            }
            else i++;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
