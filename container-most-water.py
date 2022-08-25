# Time Complexity :O(N) single pass over the array
# Space Complexity :O(1) no extra space used
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxarea=0
        l=0
        r=len(height)-1
        
        while l<r:
            h=min(height[l],height[r])
            dist=r-l
            maxarea=max(maxarea, h*dist)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
                
        return maxarea
        