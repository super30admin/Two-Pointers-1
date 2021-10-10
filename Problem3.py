#Time Complexity : O(n) 
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        output = 0
        l , r = 0, len(height) -1
        
        while l<r:
            area = (r-l) * min(height[l], height[r])
            output = max(output, area)
            
            if height[l] <height [r]:
                l+=1
            else:
                r-=1
        return output
