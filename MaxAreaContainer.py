// Time Complexity : O(n)
// Space Complexity :(1)
// Did this code successfully run on Leetcode :Yes  
// Any problem you faced while coding this : No


class Solution(object):
    def maxArea(self, height):
            low = 0
            high = len(height)-1
            max_area = 0
            while low < high:
                area = min(height[low], height[high]) * (high - low)
                if area > max_area:
                    max_area = area
                if height[low] > height[high]:
                    high -= 1
                else:
                    low += 1
            return max_area
