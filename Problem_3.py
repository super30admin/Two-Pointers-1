# Container with Most Water

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes, Runtime: 144 ms and Memory Usage: 15.2 MB
# Any problem you faced while coding this : Initally yes, After class understanding no.
# Your code here along with comments explaining your approach
# Approach
"""
Using two nested loops as a brute force solution will result in O(N square) complexity.
To optimize the same we use two pointers approach where maximum will be initialized
and area will be calculated by decreasing the width and height will be increasing so 
one pointer moving forward and other backward.

"""
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if(height==None or len(height)==0): # Edge Cases
            return 0;
        low=0
        high=len(height)-1
        maximum=0 # Initializing maximum
        while(low<high): # Finnding maximum between current and difference between high and low 
            maximum=max(maximum,min(height[low],height[high])*(high-low))
            if(height[low]<height[high]): # low is lower so incrementing that
                low=low+1
            else:
                high=high-1
        return maximum