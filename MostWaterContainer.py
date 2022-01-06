"""

You are given an integer array height of length n. There are n vertical lines 
drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the 
container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Constraints:

n == height.length
2 <= n <= 10^5
0 <= height[i] <= 10^4

"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:

        #initiate maxarea variable and start and end pointers (n0 and n2)

        max1 = 0
        n0 = 0
        n2 = len(height) -1 

        # max = initial max, minimum between n0 and n2 elements * n2-1 element
        while n0 < n2:
            
            max1 = max(max1, min(height[n0], height[n2]) * (n2 - 1))

            if height[n0] < height[n2]:
                n0 += 1
            else:
                n2 -= 1

        return max1



