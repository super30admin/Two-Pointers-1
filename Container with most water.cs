/*
  Time complexity: O(n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: The lower height dictates how much water can be stored. So when we encounter a smaller height, we look for the next or previous height based on if we are at left or right to check if we can form a container with more water than the previous iteration values.

*/

public class Solution {
    public int MaxArea(int[] height) {
        int maxArea = 0;

        int left = 0, right = height.Length-1;

        while(left<=right)
        {
            maxArea = Math.Max(maxArea, (right-left)*Math.Min(height[left],height[right]));

            if(height[left]<height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
