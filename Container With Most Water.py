class Solution:
    def maxArea(self, height: List[int]) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of height
        
        left, right = 0, len(height) - 1
        max_cap = - float('inf')
        
        while left < right:
            cap = min(height[left], height[right]) * (right - left)
            max_cap = max(max_cap, cap)
            
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        
        return max_cap