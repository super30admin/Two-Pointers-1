"Time Complexity is O(N)"
"Space Complexity is O(1)"


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_area = 0
        
        while left < right:
            # Calculate the area with the current left and right pointers
            area = min(height[left], height[right]) * (right - left)
            max_area = max(max_area, area)
            
            # Move the pointer that has the shorter line
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area
        