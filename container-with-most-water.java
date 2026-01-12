// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :  We start with two pointers at the two ends of the array. 
// At each step, we calculate the area formed by the two lines and update the maximum area. 
// We move the pointer with the smaller height inward, since moving the taller one cannot increase the area.

class Solution {
    public int maxArea(int[] height) {
        int pointer1 = 0;
        int pointer2 = height.length -1;
        int maxArea = 0;
        while(pointer1 != pointer2) {
            int curArea = Math.min(height[pointer1], height[pointer2]) * (pointer2 - pointer1);
            maxArea = Math.max(maxArea,  curArea );
            if(height[pointer1] < height[pointer2]) {
                pointer1 +=1;
            } else {
                pointer2 -=1;
            }

        }
        return maxArea;
    }
}
