## Time complexity - O(n)
## Space Complexity - O (1)

class Solution:
    def maxArea(self, height: List[int]) -> int:

        trackerMax = 0

        left = 0
        right = len(height) - 1

        while (left < right):

            length = right - left

            h = min(height[left], height[right])

            area = length * h

            trackerMax = max(area, trackerMax)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        
        return trackerMax
