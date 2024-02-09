"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes 
Three line explanation of solution in plain english
Basically we are tryihng to find the max area between 2 given heights starting from the right most and left most indices.
Next we keep moving right or left based on which height is smaller betwen the 2 heights
we continue this till the 2 pointrs cross each other.

At each step we calcualte hte area and comapre to the max area and return the maxarea once the 2 pointers cross each other 
// Your code here along with comments explaining your approach
"""


class Solution:
    def maxArea(self, height: list[int]) -> int:
        maxarea = 0
        i = 0
        j = len(height) - 1
        while i <= j:
            currarea = min(height[i], height[j]) * (j - i)
            maxarea = max(maxarea, currarea)
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return maxarea
