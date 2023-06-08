# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is create a two pointers l&r and compare the product difference of index and min of l&r pointer and try to find the max.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        mx=0
        l=0
        r=n-1
        while(l<r):    
            v=(r-l)*min(height[l],height[r])
            mx=max(mx,v)                
            if(height[l]<=height[r]):
                l+=1
            else:
                r-=1
            
        print(mx)
        return mx