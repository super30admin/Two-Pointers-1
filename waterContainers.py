# // Time Complexity : O(n)
# // Space Complexity :  O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
'''
Taking two pointers approach
Lo and hi. Start from both the ends. Find the minimum of two numbers
and multiply by distance between low and high.
Now move one of the pointers, whichever is pointing to lower number
And repeat until lo < hi
through the process, keep track of max, and return that
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        lo, hi, m = 0, len(height) - 1, 0
        
        while lo < hi:
            m = max(m, min(height[lo], height[hi]) * (hi - lo))
            if height[lo] < height[hi]:
                lo += 1
            else:
                hi -= 1
        
        return m
