// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Container With Most Water
public class Problem3 {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            if (height[left] <= height[right])
                left++;
            else
                right--;

        }
        return max;

    }

}
