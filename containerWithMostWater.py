class Solution:
    def maxArea(self, height: List[int]) -> int:
        # TC : O(n)
        # SC : O(1)
        if height is None or len(height) < 2:
            return 0
        left,right = 0, len(height)-1
        maxarea = 0
        while left < right:
            curarea = min(height[left],height[right])*(right-left)
            maxarea = max(maxarea,curarea)
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        return maxarea
        