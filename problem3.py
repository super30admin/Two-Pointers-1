'''
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : same implementation as in class

// Your code here along with comments explaining your approach
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:

        start, end, area = 0, len(height) - 1, 0

        while(start < end):
            area = max(area, min(height[start], height[end]) * ( end - start))
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1

        return area
