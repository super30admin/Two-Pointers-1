# Container With Most Water (https://leetcode.com/problems/container-with-most-water/)

# Approach: We will use 2-pointer apporach. We will take low and high pointer which will point to first and last element respectively. Now the logic is to maximize the area and area of the container depends on the point with least value from the point on low and high. SO what we will do is we will iterate through all the points and keep comparing the low and high pointer values. Whichever from both that has least value will be moved ahead or back.

# Time complexity: O(n)
# Space complexity: O(1)


class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        if height == None or len(height) == 0:
            return 0
        
        n = len(height)
        low = 0
        high = n - 1
        maxi = float("-inf")
        
        while low <= high:
            
            area = (high-low) * min(height[low], height[high])
            maxi = max(maxi, area) 
                
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
                
        return maxi
            
        