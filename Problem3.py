## Problem3 (https://leetcode.com/problems/container-with-most-water/)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maximum = float(-inf)
        low = 0
        high = len(height)-1
        if len(height) ==0 or height == []:
            return 0
        while(low<high):
            maximum = max(maximum,(min(height[low],height[high])*(high-low)))
            if height[low]<height[high]:
                low = low+1
            else:
                high = high-1
        return maximum
    
    # <!-- #Time Complexity: O(n) n - length of array
    # #Space complexity: O(1)
    # #Approach - Two pointers  -->
        