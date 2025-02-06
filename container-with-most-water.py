# Time: O(n)
# Space: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        l = 0
        r = len(height)-1
        while(l <= r):
            breadth = r -l
            leftH = height[l]
            rightH = height[r]
            length = min(leftH, rightH)
            area = length * breadth
            if maxArea < area:
                maxArea = area
            if leftH < rightH:
                l += 1
            else: r -= 1
        return maxArea

        