# Container With Most Water
#time complexity -> On
#space complexity -> O1
#logic, start from both ends, get the total volume, then whichever wall is smaller move the pointers inside from that wall as 
# small wall is our limiting factor, idea is to find the biggest wall that can generate the most volume

from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        result = 0 
        while left < right:
            leftWall = height[left]
            rightWall = height[right]
            result = max(result,min(leftWall,rightWall)*(right-left))

            if leftWall<rightWall:
                left+=1
            else:
                right-=1
        return result

sol = Solution()

print(sol.maxArea([3,2,3]))