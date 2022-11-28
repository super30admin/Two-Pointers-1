class Solution:
    """
    Time complexity - O(n). n - size of height
    Space complexity - O(1).
    """
    def maxArea(self, height: list[int]) -> int:
        start = 0
        end = len(height) - 1
        max_water = 0
        while start < end:
            max_water = max(max_water, (end-start) * min(height[start], height[end]))
            # there is possibility of larger container with height[start]
            if height[start] > height[end]:
                end -= 1
            else:
                # there is possibility of larger container with height[end]
                start += 1
        return max_water
            