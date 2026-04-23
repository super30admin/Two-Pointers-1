# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        res=0
        start=0
        end=len(height)-1

        while start<end:
            width=end-start
            ht = min(height[start],height[end])
            res = max(res, width*ht)
            if height[start]<height[end]:
                start+=1
            else:
                end-=1

        return res
        