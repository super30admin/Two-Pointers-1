# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :



class Solution:
    def maxArea(self, height: List[int]) -> int:
        maximum=0
        n=len(height)
        low=0
        high=n-1
        
        while(low<high):
            #Take the min height and multiply by *high - low to get the area
            currArea=min(height[low],height[high])*(high-low)
            #Get the max 
            maximum=max(maximum,currArea)
            #Move the pointer which has less height
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
        
        return maximum
            
                