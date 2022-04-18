'''https://leetcode.com/problems/container-with-most-water/
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith 
line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the 
container contains the most water.

Return the maximum amount of water a container can store.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array 
[1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) 
the container can contain is 49.
'''

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or len(height) <= 1: return 0
        
        # Two pointers
        left = 0
        right = len(height)-1
        maxi = 0
        while left < right:
            maxi = max(maxi, min(height[left], height[right])*(right-left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return maxi
        