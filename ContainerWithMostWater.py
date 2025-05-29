# // Time Complexity : o(n)
# // Space Complexity :o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : developing intution to why we need height to be min


# // Your code here along with comments explaining your approach
#  idea is to keep two pointers and move the pointers based on min height since that is the contraining factor which will maximixe the area



from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,h,maxArea = 0,len(height)-1, 0
        while l<h:
            minH = min(height[l], height[h])
            maxArea = max(maxArea,(h-l) *minH)
            if minH == height[l]:
                l+=1
            else:
                h-=1
        return maxArea
        