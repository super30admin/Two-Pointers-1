'''
TC: O(n)
SC: O(1) constant space
Leetcode: Success!
Problems: Confused Height constraint!

'''

class Solution:
    def maxArea(self, height) -> int:

        # Sanity Check
        if height==None or len(height)==0:
            return 0

        # initialize variables
        low = 0
        high = len(height)-1
        maxA = 0
        while low < high:
            # maxB = min(height[low],height[high]) * (high - low)
            maxA = max(maxA,min(height[low],height[high]) * (high - low))

            # check the constraint of height, as the height affects the area. if height at low < height at high increment low pointer else decrement high pointer
            if height[low]<height[high]:
                low +=1
            else:
                high -=1
        # return the resultant max area
        return maxA



s = Solution()
height = [1,8,6,2,5,4,8,3,7]
"""
height =  [4,3,2,1,4]
height = [1,1]
height = [1,2,1]
"""

maxArea = s.maxArea(height)
print("Max Area of Water: ",maxArea)
