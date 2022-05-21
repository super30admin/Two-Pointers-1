// Time Complexity : O(n) single pass
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int max = 0;
        
        while (ptr1 < ptr2){
            int current = Math.min(height[ptr1], height[ptr2]) * (ptr2-ptr1);
            if (current > max) max = current; // update max amount
            if (height[ptr2] > height[ptr1]){
                ptr1++;
            }
            else{
                ptr2--;
            } 
        }
        return max;
    }
}