# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height) == 0: #checking for null condition
            return 0
        low = 0
        high = len(height) - 1
        max_area = 0
        while(low < high): # running the loop till the low pointer crosses high pointer
            area = min(height[low], height[high]) * (high - low) # calculating the area for elements of pointer low and high
            max_area = max(area, max_area) # comparing max area with previous max area
            if height[low] <= height[high]:  # if element at low pointers height is less then we increment the low pointer else we decrement high pointer
                    low += 1
            else:
                high -= 1
        return max_area