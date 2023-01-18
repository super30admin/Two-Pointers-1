# 1. Container With Most Water

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # two pointer
        p1 = 0
        p2 = len(height)-1
        maxA = 0
        while p1<=p2: # O(n)
            width = p2-p1
            if height[p1] > height[p2]:
                new_area = width*height[p2]
                p2 = p2 -1
            else:
                new_area = width*height[p1]
                p1 = p1 +1
            
            if new_area > maxA:
                maxA = new_area
        return maxA
