#Time Complexity: O(N) single pass two pointer approach
#Space Complexity : O(1) as we are just storing the variable

"""
We are using a two pointer approach to find the maximum area
we are calculating the width based on the distance between the two pointers and the height based 
on the min height between the two pointers. We will increment the left pointer if its smaller than the right or decrement right vice versa
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1
        maxArea = 0

        while(low < high):
            width = high - low
            maxArea = max(maxArea, min(height[low],height[high])* width)
            if height[low]< height[high]:
                low+=1
            else:
                high-=1
        return maxArea