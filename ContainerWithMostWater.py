# TC: O(N) single one pass approach using two pointers. N is the size of the input array.
# SC: O(1) since we do not use any extra space.


class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi = 0
        left = 0
        right = len(height) - 1
        
        while left < right:
            maxi = max(maxi, (right - left)*min(height[left], height[right]))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return maxi
