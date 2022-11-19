# Time Complexity: O(N)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Here we use a 2pointer approach one pointer at the beginning and one at the end
# we calculate the area of the water trapped and update the max_water when current area is greater
# then we move to next height from the pointer whose height is lesser among the 2
# we terminate at low = high since a single element cant hold water
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_water:int = 0
        low:int = 0
        high:int = len(height) - 1

        while low < high:
            curr_area:int = min(height[low],height[high])*(high-low)
            if curr_area > max_water:
                max_water = curr_area

            if height[low] > height[high]:
                high-=1
            else:
                low+=1
        return max_water