# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# we are going to have two pointer - one at the lft end and other at the right end
# now we compare the area beween them and update the values of max area accordingly.
# if the array[left] is the lesser value we then move left one index to the right. else, we move right pointer one index to left.
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n=len(height)
        max_area=0
        left=0
        right = n-1
        while (left<right):
            max_area=max(max_area, (min(height[left], height[right])*(right-left)))
            if(height[left]<height[right]):
                left+=1
            else:
                right-=1
        return max_area