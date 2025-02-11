# Container With Most Water
# Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        op = 0

        while left < right:
            currarea =  min(height[left], height[right])*(right-left)
            op = max(op, currarea)

            if height[left]<= height[right]:
                left += 1
            else:
                right -= 1
        return op