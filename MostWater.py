# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        w=len(height)-1
        h=0
        maximum=0
        l,r=0,w
        
        while(l<r):
            maximum=max(maximum,min(height[l],height[r])*w)
            
            if(height[l]<height[r]):
                l+=1
            else :
                r-=1
            
            w-=1
        
        return maximum
            
        