# Time Complexity : 
# Space Complexity:
# Works on leetcode:
# Approach: We start from 2 end points. As indexes is the width and actual array values the height. We start from widest container
# with 0 and len(array) as width and height is smaller of the two. All other containers are less wide so they need higher
# height. At each iteration smaller of the two pointer values can be removed.
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        L, R, res = 0, len(height)-1,0
        for w in range(len(height)-1,0,-1):
            if height[L]<height[R]:
                res, L = max(res, height[L]*w), L+1
            else:
                res, R = max(res, height[R]*w), R-1
        return res