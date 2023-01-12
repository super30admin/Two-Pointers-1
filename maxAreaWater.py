# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No
class Solution(object):
    def maxArea(self, height):
        maxarea=0
        (l,h)=(0,len(height)-1)
        while(l<h):
            maxarea=max(maxarea,(h-l)*min(height[l],height[h]))
            if(height[l]<height[h]):
                l+=1
            else:
                h-=1
        return maxarea
