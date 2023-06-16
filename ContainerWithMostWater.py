# Time Complexity : O(n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Maintain left and right pointers, starting at start and end respectively. Calculate the area and update the pointer with smaller value, since we cant use it to get larger area.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        res = 0

        l = 0; r = len(height) - 1

        while l <= r:
            h = min(height[l], height[r])

            res = max(res, h*(r-l))

            if height[l] < height[r]:
                l+=1
            else:
                r-=1

        return res