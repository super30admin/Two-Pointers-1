// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I use two pointers at the ends and calculate the area formed by the shorter height.
Then I move the pointer with the smaller height inward because only a taller line can increase the area.
I keep updating the maximum area until the two pointers meet.
*/

public class Problem3 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        while(left < right) {
            int tempArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(tempArea, maxArea);

            if(height[left] < height[right]) {
                left++; 
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
