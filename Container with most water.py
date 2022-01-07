
 # Time Complexity : O(n) where n is the length of list.
 # Space Complexity : O(1)
 # Did this code successfully run on Leetcode : Yes.

class Solution:
    def maxArea(self, height: List[int]) -> int:
            if(height==None or len(height) ==0):return 0
            low =0
            high = len(height)-1
            maxA=0
            h=0
            w=0
            while (low<high):
                    w=high-low
                    h=min(height[low],height[high])
                    maxA= max(maxA,w*h)
                    if(height[low]<=height[high]):
                        low+=1
                    else:
                        high-=1
            return maxA