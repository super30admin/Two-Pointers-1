'''
-- Passed test cases on LeetCode
'''
class Solution:

    def maxArea(self, height: List[int]) -> int:
# Two Pointer Approach
#Time Complexity - O(n) as we do n number of comparisions between the low and high pointers ; Space Complexity - O(1)

        maxim = 0
        low = 0
        high = len(height) - 1
        for i in range(low, high):
            maxim = max(maxim, min(height[low],height[high]) * (high - low))
            if height[low] <= height[high]:
                low += 1
            else:
                high -= 1
        return maxim    
        
# Brute Force Approach
#Time Complexity - O(n^2); Space Complexity - O(1)
        ''''
        maxim = 0
        for i in range(len(height)):
            for j in range(i+1, len(height)):
                maxim = max(maxim, min(height[i], height[j]) * (j-i))
        return maxim
        '''
        
