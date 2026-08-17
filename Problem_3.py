# https://leetcode.com/problems/container-with-most-water/

# TC: O(n)
# SC: O(1)
# Explanation: Maintain two pointers starting at index 0 and n - 1; keep moving the pointers based on highest point;
# at each pass find the max area; return the final max area

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l, r = 0, n - 1
        m_height = 0

        while l < r:
            m_height = max(m_height, min(height[l], height[r]) * (r - l))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        
        return m_height
