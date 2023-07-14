# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA
# Using pointers, point low to 0th Index and high at last index.if the height of low index is low then high, Calculating area using formula height[low]*(high-low) and incrementing low pointer by 1 else Calculating area using formula height[high]*(high-low) and decrementing high pointer.Then, Finding the max currentArea. 


class Solution:
    def maxArea(self, height: List[int]) -> int:
        low=0
        high=len(height)-1
        maxAmount=0
        currentArea=0
        start=0
        end=0

        while(low<high):
            if height[low]<height[high]:
                currentArea=height[low]*(high-low)
                low+=1
            else:
                currentArea=height[high]*(high-low)
                high-=1             
            
            #maxAmount=max(maxAmount,currentArea)
            if maxAmount<currentArea:
                maxAmount=currentArea
                start=low
                end=high
        print(maxAmount,start,end)
        return maxAmount