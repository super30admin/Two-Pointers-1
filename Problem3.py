# Two pointers. Which ever is smaller update that pointer until left < right. Find the max of the areas
# TC: O(n)
# SC: O(1)
# Yes, this worked in leetcode

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) < 2:
            return 0
        left = 0
        right = len(height) - 1
        maxi = (len(height) - 1) * min(height[left], height[right])
        while left < right:
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
            maxi = max(maxi, ((right - left) * min(height[left], height[right])))
        return maxi
