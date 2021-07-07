 // Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxc=0
        l=0
        h=len(height)-1
        while(l<=h):
            maxc=max(maxc,min(height[l],height[h])*(h-l))
            if(height[l]<height[h]):
                l+=1
            else:
                h-=1
        return maxc
            
