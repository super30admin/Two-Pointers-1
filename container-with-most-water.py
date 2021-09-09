# Time complexity
0(N)
# Space complexity
0(1)
# yes code worked succesfully on leetcode

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l = 0
        h = len(height)-1
        A = float("-inf")
        
        while l <=h:
            A = max(A,  (h-l)*min(height[h],height[l]))
            if height[l]<=height[h]:
                l+=1
            else:
                h-=1
        return A
