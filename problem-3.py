#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes
#Use two pointers to find max area limits
class Solution:
    def maxArea(self, height: List[int]) -> int:
#initialize pointers
        maxarea=0
        l=0
        r=len(height)-1
        while(l<=r):
            cur_area  = (r-l)*min(height[r],height[l])
#Update maxarea if current area is larger
            maxarea = max(maxarea,cur_area)
#Update pointers to maximize height
            if height[r]<height[l]:
                r -= 1
            else:
                l += 1
        return maxarea