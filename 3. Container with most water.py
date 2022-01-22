class Solution:
    def maxArea(self, height) -> int:
        # Time Complexity - O(n)
        # Space Complexity - O(1)
        i = 0
        j = len(height) - 1
        water = 0
        while i < j:
            water = max(water, (j - i) * min(height[i], height[j]))

            # Move away from the smaller line and keep the larger line
            if height[i] > height[j]:
                j -= 1
            else:
                i += 1

        return water