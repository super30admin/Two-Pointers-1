#11. Container With Most Water
#Time Complexity : O(n). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == [] or len(height) < 1:
            return 0
        i = 0
        j = len(height)-1
        area = 0
        while i < j:
            a = (j - i) * min(height[i],height[j])
            area = max(area,a)
            if i < j and height[i] <= height[j]:
                i = i + 1
            elif i < j and height[j] <= height [i]:
                j = j - 1
        return area