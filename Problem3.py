# Time Complexity : o(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#using two pointer method and comparing hieghts and removing the lower height side

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        i,j = 0,n-1
        maxA = -1
        while i <= j:
            maxA = max(maxA , abs(j-i)*min(height[i],height[j]))
            if height[i] <= height[j]:
                i+=1
            else:
                j-=1
        return maxA
                

