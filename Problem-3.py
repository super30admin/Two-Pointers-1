#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if(height==None or len(height)==0):
            return 0
        low=0
        high=len(height)-1
        maxi=0
        while(low!=high ):
            #print(low,high,maxi)
            if(height[low]<=height[high]):
                area=height[low]*(high-low)
                if(maxi<area):
                    maxi=area
                low+=1
            else:
                area=height[high]*(high-low)
                if(maxi<area):
                    maxi=area
                high-=1
        return maxi
                
            
        