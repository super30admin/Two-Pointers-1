# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: This code solves the Container With Most Water problem using the two-pointer technique.It starts with pointers at both ends of the array and calculates the area as the smaller height times the width between the pointers. At each step, it moves the pointer with the smaller height inward to try for a larger area, keeping track of the maximum found until the pointers meet


class Solution:
    def maxArea(self, height: List[int]) -> int:
         n = len(height)
         low, high = 0, n - 1
         area = 0
         while low < high:
            h = 0
            w = high - low

            if height[low] < height[high]:
                h = height[low]
                low += 1
            else:
                h = height[high]
                high -= 1
            
            area = max(area, h * w)

         return area