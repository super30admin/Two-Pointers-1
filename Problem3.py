# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        
        if n == 0:
            return 0
        # setting the two pointer one at the start and other at end, cont is the max water contained between two indexes
        left = 0
        right = n-1
        cont = 0
        
        # traversing the list, finding the min value out of the values at 2 pointers, then finding the area by multiplying it with the width
        # finding the max out of the prev and curr area
        while left < right:
            cont = max(cont,min(height[left],height[right]) * (right - left))
            
            # check the values at both pointers, and move the pointer based on the lower value out of the two
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        # finally return the max water containted
        return cont
        
        
        '''
        # brute force solution
        max_h = -1
        for i in range(n):
            for j in range(i,n):
                max_h = max(max_h,min(height[i],height[j])*(j-i))
        
        return max_h
        '''
