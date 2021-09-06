# Max_area
# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        max_area = -1
        while i<j:
            h1 = min(height[i], height[j])
            width = j-i
            area = h1 * width
            max_area = max(area, max_area)
            if height[i] < height[j]:
                i+=1
            else:
                j-=1
        
        return max_area
            