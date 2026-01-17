#limiting factors are width and min(h1,h1), the min height. So we start with max width possible (two-pointer greedy approach) and the
#move the pointers accordingly to maximize the area possible.
#after we have explored the max water possible with a pointer (left or right), we move it.

from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:

        max_area = 0

        left , right = 0, len(height)-1

        while left <= right: #it can be left < right also
            area = min(height[left], height[right]) * (right-left)

            max_area = max(area, max_area)

            if height[left] < height[right]:
                left += 1
            else:
                right -=1

        return max_area
    
# Time Complexity: O(N)
# Space Complexity: O(1)
#brute force is nested iterations O(N2)
# The two-pointer approach does not necessarily compute the maximum area for each individual height.
# It still finds the global maximum, because it only evaluates the pairs that could possibly beat the best-so-far.
# example left = 2, right = 8 width = 50
# min(2,8) * 50 = 2*50 = 100
# we need to beat this 100. The only way we can beat 100 is to move left pointer, if left pointer is some value say 8 
# then min(8,8)= 8*49
# if we move right pointer max we can get is min(2,2)*49. which is 2*49 at best we can find.
#Two pointers rely on discarding indices that can’t be part of the global optimum.