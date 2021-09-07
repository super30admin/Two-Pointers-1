# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        if n==0 or n==1: return 1
        left = 0
        right = n-1
        max_area = float('-inf')
        while left <= right:
            left_val = height[left]
            right_val = height[right]
            length = right-left
            breadth = min(left_val,right_val)
            area = length*breadth
            if area > max_area:
                max_area = area
            if left_val <right_val:
                left+=1
            else:
                right-=1
        return max_area
        
