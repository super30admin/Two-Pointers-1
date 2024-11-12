# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No

# // Your code here along with comments explaining your approach

# optimized Solution
class Solution:
    def maxArea(self, height: list[int]) -> int:
        #initialize 2 pointers 
        n = len(height)
        l = 0
        r = n-1
        maxA = 0                        # we want to calculate the area which is currently max
        while l <= r:                   
            h = 0                       # curr height 
            w = r-l                     # curr width
            if height[l] <= height[r]:  # select minimum height at l 
                h = height[l]
                l+=1
            else:
                h = height[r]           # select minimum height at r
                r -=1
            maxA = max(maxA, w*h)       # set area
        return maxA 


# Original Solution: checks 1 extra time (runtime slower)
# class Solution:
#     def maxArea(self, height: list[int]) -> int:
        
#         n = len(height)
#         l = 0
#         r = n-1
#         maxA = 0
#         while l <= r:
#             h = min(height[l],height[r])
#             w = r-l
#             maxA = max(maxA,h*w)
#             if height[l] <= height[r]:
#                 l+=1
#             else:
#                 r -=1
#         return maxA 