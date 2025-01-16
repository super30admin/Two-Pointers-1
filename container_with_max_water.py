#Time Complexity = O(n)
#Space Complexity = O(1)
#Approach = starting with one pointer at each end of the array and moving them inward based on
# the smaller height, ensuring all possible areas are checked in. At each step, the area is calculated 
# and the maximum area is updated if the current area is larger

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r = 0 , len(height)-1
        res = 0
        while l < r:
            area = min(height[l],height[r]) * (r-l)
            res = max(area,res)
            if height[l] < height[r]:
                l+= 1
            else:
                r -= 1
        return res