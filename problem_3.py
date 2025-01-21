#  Problem : https://leetcode.com/problems/container-with-most-water/
#  Time Complexity: O(N)
#  Space Complexity: O(1)

#  Approach: I am using two pointers left and right.
#  I am calculating the area between left and right and storing the maximum area.
#  I am moving the pointer which has the smaller height.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_area = float('-inf')
        while left < right:
            area = min(height[left], height[right]) * (right - left)
            max_area = max(area, max_area)
            if height[left] < height[right]:
                left += 1 
            else:
                right -= 1
        
        return max_area
