class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        '''// Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : yes 
        // Any problem you faced while coding this : No
        // Your code here along with comments explaining your approach '''
        
        if len(height)==0 or len(height)==1:
            return 0
        
        #Left and right pointer
        left=0
        right=len(height)-1
        #max vol
        currmax=0
        #width
        width=right-left
        while right > left:
            #choose min height
            h=min(height[left], height[right])
            #current vol
            vol=h*width
            #max vol
            currmax=max(currmax, vol)
            
            #increment min heigth
            if height[left]<height[right]:
                left+=1
                width-=1
            else:
                right-=1
                width-=1
        return currmax
