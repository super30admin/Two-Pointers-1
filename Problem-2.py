"""
Approach:
1) use two pointers to keep track of area
2) move your index range/ pointers such that you try to maximize the area
3) return the max area
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_area = float('-inf')
        while left < right:
            curr_area = (right - left) * min(height[left], height[right])
            max_area = max(max_area, curr_area)
            if height[left] < height[right]:
                left += 1
            else:
                right -=1
        return max_area


"""
TC: O(n)
SC: O(1)
"""