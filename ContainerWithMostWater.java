// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We saw the brute force approch n^2, and to bring down the complexity we can see binary search, hashmap, Two pointers, Sliding window.
 * TWO POINTERS approach: we start left from 0 and right from end, then calculte max and update it. Whichever is lesser we move that pointer
 * being optimistic that we may find larger value moving forward. Pick either pointer to move if values are equal. 
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length < 1) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}
