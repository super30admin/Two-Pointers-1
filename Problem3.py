## Problem3 (https://leetcode.com/problems/container-with-most-water/)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Time Complexity: O(N), where N is the length of the height array.
        # We traverse the array exactly once because the pointers move towards each other.
        
        # Space Complexity: O(1). We only use a few constant extra variables 
        # (n, i, j, maxWater, area) regardless of the input size.

        n = len(height)
        
        # Initialize two pointers at the very beginning and the very end of the array
        i, j = 0, n - 1 
        maxWater = 0
        
        while i < j:
            # The height of the container is limited by the shorter line. 
            # The width is the distance between the two pointers (j - i).
            area = (j - i) * min(height[i], height[j])
            
            # Update the maximum water found so far
            maxWater = max(maxWater, area)
            
            # Move the pointer that points to the shorter line inward.
            # Explanation: Since the width is decreasing at each step, the only way 
            # to potentially find a larger area is to look for a taller line to 
            # replace the currently shorter one.
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
                
        return maxWater