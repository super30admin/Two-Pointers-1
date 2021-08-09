"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""






class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height)==0:
            return 0
        low = 0 
        high = len(height) - 1
        maximum = 0
        while(low<=high):
            maximum = max(maximum,(high-low)*min(height[high],height[low]))
            if(height[low]<height[high]):
                low+=1
            else:
                high-=1
        return maximum

        # if len(height) == 0:
        #     return 0
        # maximum = 0
        # for i in range(0,len(height)):
        #     for j in range(1,len(height)):
        #         maximum = max(maximum,(j-i)*min(height[i],height[j]))
        # return maximum