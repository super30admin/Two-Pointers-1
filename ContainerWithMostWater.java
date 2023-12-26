// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Array Traversal

class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int start = 0, end = n - 1;

        int minimum, maximum = Integer.MIN_VALUE;

        while(start < end)
        {
            if(height[start] <= height[end])
            {
                minimum = height[start];

                maximum = Math.max(maximum, minimum * (end - start));
                ++start;
            }
            else
            {
                minimum = height[end];

                maximum = Math.max(maximum, minimum * (end - start));
                --end;
            }
        }

        return maximum;
    }
}