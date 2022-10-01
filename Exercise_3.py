# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        res = 0
        l = 0
        r = len(height) - 1
        
        while(l<r):
            minH = min(height[l], height[r])
            area = (r-l) * minH
            res = max(res, area)
            
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
                
        return res            