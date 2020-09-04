# Leetcode link : https://leetcode.com/problems/container-with-most-water/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
    Brute force approach O(n2)=> Start from first index and keep calculating the area for all the index heights and width. Compare with max area at each point. Repeat the same process starting at every index. Return max area at the end
    
   Two pointer solution => Start with first pointer at 0th index and second pointer at last index as that gives max width.
   As the min height is restricting max area, we want to maximize height and hence we increment the left counter if height is lesser for left index else decrement the right counter.
   Keep comparing the max area at every instance and return the max area at the end
'''


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height or len(height) <= 1:
            return 0
        max_area = float('-inf')
        i = 0
        j = len(height) - 1
        
        while (i < j):
            curr_area = min(height[i], height[j]) * (j - i)
            if (height[i] < height[j]):
                i += 1
            else:
                j -= 1
            max_area = max(max_area, curr_area)
        
        return max_area
        