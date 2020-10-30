'''
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right  = len(height) -1
        m = 0
        while(left<right):
            if height[left] < height[right]:
                m = max(m,(right - left)*height[left])
                left +=1
            else:
                m = max(m,(right - left)*height[right])
                right-=1
        
        
        return m
                