# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if not height:
            return 0
        low = 0
        high = len(height)-1
        Max = 0
        #create two pointers at start and end of array and a max
        while low < high:
            #calculate current area
            curr = (high-low) * min(height[high],height[low])
            #if length at high is shorter than length of low decrease high by one
            if height[high]<height[low]:
                high -=1
            else:
                # increase low by one
                low +=1
            #check if curr is bigger than max and if yes assign it to max
            Max = max(Max,curr)
        #return maxwx
        return Max