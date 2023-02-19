# 2 Pointers
# Successfully submitted
# TC=O(n), SC=O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        area = 0

        while left<right:
            area = max(area, (right-left)*min(height[left], height[right]))
            if height[left]<height[right]:    # we move the pointer at a lesser height aiming for a higher height and thus higher area
                left+=1
            else:    # if heights are equal we can move either pointer
                right-=1

        return area