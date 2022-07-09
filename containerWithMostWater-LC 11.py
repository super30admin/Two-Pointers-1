# Time Complexity = O(n), Iterating over all elements once
# Space Complexity = O(1)

class Solution:
    def maxArea(self, height: list[int]) -> int:
        if height == None or len(height) == 0:
            return 0
        
        n = len(height)
        maxArea = 0
        
        # Initialising the index of pointers
        left = 0
        right = n - 1
        
        # Base condition to stop the while loop
        while (left <= right):
            maxArea = max(maxArea, (min(height[left], height[right]) * (right - left)))
            
            # If left pointer element is smaller, we shift the left pointer coz there is a possibility of finding a larger element ahead
            if height[left] < height[right]:
                left += 1
            else: 
                right -= 1
                
        return maxArea