# Time Complexity : O(N)
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height ==None or len(height)==0:
            return 0
        maxv =0
        n = len(height)
        l=0
        h=n-1
        while(l<h):
            maxv = max(maxv, min(height[l],height[h])*(h-l))
            if height[l]<= height[h]:
                l+=1
            else:
                h-=1
        return maxv