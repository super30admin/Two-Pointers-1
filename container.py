# Time Complexity : O(N), traversisng elements in array
# Space Complexity : O(1), no auxiliary datastructures
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        area = 0
        maximum = 0
        i = 0
        j = len(height)-1
        
        while(i<j):
            min_height = min(height[i], height[j])
            width = j-i
            area = min_height * width 
            maximum = max(maximum, area)
            
            if(height[i]< height[j]):
                i += 1
            else:
                j -= 1
        return maximum
        