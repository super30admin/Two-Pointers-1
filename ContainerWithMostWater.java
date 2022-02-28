// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Use two pointers one at the beginning and the other at the end. Increment the pointer i if
// height[i] is less than height[j] else decrement the j pointer. At every instance calculte 
// volume of water and update the maximum value accordingly.

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i =0;
        int j =height.length-1;
        while(i<j){
            if(height[i]>height[j]){
                if(max<(j-i)*height[j]){
                    max = (j-i)*height[j];
                }
                j--;
            }
            else{
                if(max<(j-i)*height[i]){
                    max = (j-i)*height[i];
                }
                i++;
            }
        }
        return max;
    }
}